/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.DoubleProcessor;
import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.JulianDateProcessor;

/**
 * @author zabelc
 *
 */
public class CrhfRecordParserFactory implements RecordParserFactory {

	
	private RecordParser recordMapper = new RecordParser();{
		//ZKP ACT C			Field Name	,Field Length
		recordMapper.addMappedField("ZOR-DOC-NUM"	,14);
		recordMapper.addMappedField("SUFFIX"		,1);
		recordMapper.addMappedField("OUTPUT-ID"		,1);
		recordMapper.addMappedField("SFX"			,1);
		recordMapper.addMappedField("MRO-NSN"		,15);
		recordMapper.addMappedField("MRO-UI"		,2);
		recordMapper.addMappedField("REG"			,1);
		recordMapper.addMappedField("ACTIVITY"		,1);
		recordMapper.addMappedField("BUYER"			,2);
		recordMapper.addMappedField("MRO-RIC-TO"	,3);
		recordMapper.addMappedField("MRO-TD"		,2);
		recordMapper.addMappedField("STATUS"		,2);
		recordMapper.addMappedField("DISCREP-TYPE"	,1);
		recordMapper.addMappedField("PROC-CD-1"		,2);
		recordMapper.addMappedField("PROC-DATE-1"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-2"		,2);
		recordMapper.addMappedField("PROC-DATE-2"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-3"		,2);
		recordMapper.addMappedField("PROC-DATE-3"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-4"		,2);
		recordMapper.addMappedField("PROC-DATE-4"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-5"		,2);
		recordMapper.addMappedField("PROC-DATE-5"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-6"		,2);
		recordMapper.addMappedField("PROC-DATE-6"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-7"		,2);
		recordMapper.addMappedField("PROC-DATE-7"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-8"		,2);
		recordMapper.addMappedField("PROC-DATE-8"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-9"		,2);
		recordMapper.addMappedField("PROC-DATE-9"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("PROC-CD-10"	,2);
		recordMapper.addMappedField("PROC-DATE-10"	,7,new JulianDateProcessor());
		recordMapper.addMappedField("MODE"			,1);
		recordMapper.addMappedField("TCN"			,17);
		recordMapper.addMappedField("GBL"			,8);
		recordMapper.addMappedField("PO-NR"			,11);
		recordMapper.addMappedField("FOB"			,1);
		recordMapper.addMappedField("ACO"			,1);
		recordMapper.addMappedField("MOP"			,1);
		recordMapper.addMappedField("PERCENT-UP"	,2);
		recordMapper.addMappedField("PERCENT-DOWN"	,2);
		recordMapper.addMappedField("DIVERSION-ADD"	,6);
		recordMapper.addMappedField("EPF"			,1);
		recordMapper.addMappedField("POE"			,3);
		recordMapper.addMappedField("HOLD"			,1);
		recordMapper.addMappedField("SDC"			,1);
		recordMapper.addMappedField("CANC-SOURCE"	,1);
		recordMapper.addMappedField("IMC"			,1);
		recordMapper.addMappedField("MGR"			,2);
		recordMapper.addMappedField("DUNS-NR"		,9);
		recordMapper.addMappedField("QTY-SHIPPED"	,5);
		recordMapper.addMappedField("QTY-DENIED"	,5);
		recordMapper.addMappedField("DATE-AVAIL"	,5);//Why 5 characters?
		recordMapper.addMappedField("SHIP-DATE"		,7,new JulianDateProcessor());
		recordMapper.addMappedField("SELL-PR"		,7,new DoubleProcessor(5,7));
		recordMapper.addMappedField("COST-PR"		,7,new DoubleProcessor(5,7));
		recordMapper.addMappedField("UNIT-WGT"		,7,new DoubleProcessor(4,7));
		recordMapper.addMappedField("BILL-DATE"		,7,new JulianDateProcessor());
		recordMapper.addMappedField("MARK-UP"		,4,new DoubleProcessor(0,4));
		recordMapper.addMappedField("ACT-E-D"		,1);
		recordMapper.addMappedField("FILLER"		,1);
	}
	
	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.mapping.RecordMapperFactory#getRecordMapper()
	 */
	@Override
	public RecordParser getRecordParser() {
		return this.recordMapper;
	}

}
