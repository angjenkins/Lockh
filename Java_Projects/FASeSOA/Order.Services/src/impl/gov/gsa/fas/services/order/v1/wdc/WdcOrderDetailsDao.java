package gov.gsa.fas.services.order.v1.wdc;

import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.services.order.v1.GetOrderDetailsResponse;
import gov.gsa.fas.services.order.v1.wdc.dao.AbstractWdcOrderPartDaoFactory;
import gov.gsa.fas.services.order.v1.wdc.dao.OrderPart;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDao;
import gov.gsa.fas.services.order.v1.wdc.dao.WdcOrderPartDaoWsImplFactory;
import gov.gsa.fas.services.order.v1.wdc.mapping.CrhfBasRecordMapper;
import gov.gsa.fas.services.order.v1.wdc.mapping.CrhfRecordMapper;
import gov.gsa.fas.services.order.v1.wdc.mapping.RecordMapper;
import gov.gsa.fas.services.order.v1.wdc.mapping.UrhfRecordMapper;
import gov.gsa.fas.services.order.v1.wdc.mapping.ZkpBasRecordMapper;
import gov.gsa.fas.services.order.v1.wdc.parsing.CrhfBasRecordParserFactory;
import gov.gsa.fas.services.order.v1.wdc.parsing.CrhfRecordParserFactory;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParser;
import gov.gsa.fas.services.order.v1.wdc.parsing.RecordParsingException;
import gov.gsa.fas.services.order.v1.wdc.parsing.UrhfRecordParserFactory;
import gov.gsa.fas.services.order.v1.wdc.parsing.ZkpBasRecordParserFactory;
import gov.gsa.fas.services.order.v1.wdc.parsing.ZkpRecordParserFactory;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class WdcOrderDetailsDao {
	private final static Logger logger = Logger.getLogger(WdcOrderDetailsDao.class.getName());

	private WdcOrderPartDao zkpBasOrderPartDao;
	private WdcOrderPartDao urhfOrderPartDao;
	private WdcOrderPartDao crhfOrderPartDao;

	private RecordParser zkpParser;
	private RecordParser zkpBasParser;
	private RecordParser crhfBasParser;
	private RecordParser urhfParser;
	private RecordParser crhfParser;
	
	private RecordMapper zkpBasRecordMapper;
	private RecordMapper crhfBasRecordMapper;
	private RecordMapper urhfRecordMapper;
	private RecordMapper crhfRecordMapper;

	/**
	 * Create with the default factory
	 * @throws IOException
	 * @throws SAXException
	 */
	public WdcOrderDetailsDao(){
		this(new WdcOrderPartDaoWsImplFactory());
//		this(new WdcOrderPartDaoMockImplFactory());
	}
	
	/**
	 * Create with a provided factory
	 * @param wdcOrderPartDaoFactory
	 * @throws IOException
	 * @throws SAXException
	 */
	public WdcOrderDetailsDao(AbstractWdcOrderPartDaoFactory wdcOrderPartDaoFactory){
		
		this.zkpBasOrderPartDao = wdcOrderPartDaoFactory.createWdcOrderPartDao_ZkpBas();
		this.urhfOrderPartDao = wdcOrderPartDaoFactory.createWdcOrderPartDao_Urhf();
		this.crhfOrderPartDao = wdcOrderPartDaoFactory.createWdcOrderPartDao_Crhf();

		this.zkpParser = (new ZkpRecordParserFactory()).getRecordParser();
		this.zkpBasParser = (new ZkpBasRecordParserFactory()).getRecordParser();
		this.crhfBasParser = (new CrhfBasRecordParserFactory()).getRecordParser();
		this.urhfParser = (new UrhfRecordParserFactory()).getRecordParser();
		this.crhfParser = (new CrhfRecordParserFactory()).getRecordParser();

		this.zkpBasRecordMapper = new ZkpBasRecordMapper();
		this.crhfBasRecordMapper = new CrhfBasRecordMapper();
		this.urhfRecordMapper = new UrhfRecordMapper();
		this.crhfRecordMapper = new CrhfRecordMapper();
	}

	
	public GetOrderDetailsResponse getOrderDetails(OrderNumber orderNumber) throws RecordParsingException {
		String orderNum = orderNumber.getValue();
		String suffix = orderNumber.getSuffix();
		
		GetOrderDetailsResponse response  = new GetOrderDetailsResponse();
		
		response.setOrder( getOrder(orderNum, suffix) );
		
		return response;
	}

	private Order getOrder(String orderNum, String suffix) throws RecordParsingException {
		logger.info("getOrder(): Getting Order details for Order Number->" + orderNum + ", " +
				"Suffix->" + suffix);
		OrderPart orderPart = this.zkpBasOrderPartDao.getOrderPart(orderNum, suffix);
		if( orderPart.isMissing() ){
			logger.error("getOrder(): Order Part-Base is Missing for Order Number->" + orderNum);
			return null;
		}

		Order order = OrderUtils.createOrder();
		ParsedRecord zkpData = this.zkpParser.parseRecord(orderPart.getPartData());
		//Determine whether we're searching for an UHRF or CHRF Record
		if ( "1".equals(zkpData.getRawValue("OUTPUT-ID")) ){
			logger.info("getOrder(): Getting URHF Record for Order Number->" + orderNum);
			ParsedRecord zkpBasData = this.zkpBasParser.parseRecord(orderPart.getPartData());
			this.zkpBasRecordMapper.mapParsedRecordToOrder(zkpBasData, order); 
			orderPart = this.urhfOrderPartDao.getOrderPart(orderNum, suffix);
			if( orderPart.isMissing() ){
				logger.error("getOrder(): Order Part-URHF is Missing for Order Number->" + orderNum);
				return null;
			}
			ParsedRecord urhfData = this.urhfParser.parseRecord(orderPart.getPartData());
			this.urhfRecordMapper.mapParsedRecordToOrder(urhfData, order); 
		} else{
			logger.info("getOrder(): Getting CRHF Record for Order Number->" + orderNum);
			ParsedRecord crhfBasData = this.crhfBasParser.parseRecord(orderPart.getPartData()); 
			this.crhfBasRecordMapper.mapParsedRecordToOrder(crhfBasData, order);
			orderPart = this.crhfOrderPartDao.getOrderPart(orderNum, suffix);
			if( orderPart.isMissing() ){
				logger.error("getOrder(): Order Part-CRHF is Missing for Order Number->" + orderNum);
				return null;
			}
			ParsedRecord crhfData = this.crhfParser.parseRecord(orderPart.getPartData());
			this.crhfRecordMapper.mapParsedRecordToOrder(crhfData, order); 
		}
		
		return OrderUtils.cleanOrder(order);
	}



}
