/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.JulianDateProcessor;

/**
 * @author zabelc
 *
 */
public class ZkpBasRecordParserFactory implements RecordParserFactory {

	
	private RecordParser recordParser = new RecordParser();{
		recordParser.addMappedField("ZOR-DOC-NUM"	,14);
		recordParser.addMappedField("SUFFIX"	,1);
		recordParser.addMappedField("OUTPUT-ID"	,1);
		recordParser.addMappedField("DIC"	,3);
		recordParser.addMappedField("RIC"	,3);
		recordParser.addMappedField("M-S"	,1);
		recordParser.addMappedField("NSN"	,15);
		recordParser.addMappedField("UI"	,2);
		recordParser.addMappedField("DOC-NR"	,14);
		recordParser.addMappedField("SUP-ADDR"	,6);
		recordParser.addMappedField("SIGNAL"	,1);
		recordParser.addMappedField("FUND"	,2);
		recordParser.addMappedField("DIST"	,3);
		recordParser.addMappedField("PROJ"	,3);
		recordParser.addMappedField("PRI"	,2);
		recordParser.addMappedField("RDD"	,3);
		recordParser.addMappedField("ADVICE"	,2);
		recordParser.addMappedField("AREA-REDF"	,14);
		recordParser.addMappedField("AGENCY"	,2);
		recordParser.addMappedField("BUREAU"	,2);
		recordParser.addMappedField("STATE"	,2);
		recordParser.addMappedField("CITY"	,4);
		recordParser.addMappedField("EXP-DOM"	,1);
		recordParser.addMappedField("INPUT-SRC"	,1);
		recordParser.addMappedField("CONSIGNEE"	,6);
		recordParser.addMappedField("EDI"	,4);
		recordParser.addMappedField("NAS"	,1);
		recordParser.addMappedField("TRANS-IND"	,1);
		recordParser.addMappedField("BR-CANC-CTR"	,2);
		recordParser.addMappedField("BR-CANC-VALUE"	,8);
		recordParser.addMappedField("BS-CANC-CTR"	,2);
		recordParser.addMappedField("BS-CANC-VALUE"	,8);
		recordParser.addMappedField("UNTRANSFER-IND"	,1);
		recordParser.addMappedField("PRIME-CONS"	,6);
		recordParser.addMappedField("NR-ACT-SEG"	,2);
		recordParser.addMappedField("FILLER"	,4);
		recordParser.addMappedField("BASE-SEG-IND"	,1);
		recordParser.addMappedField("QTY-REQD"	,5);
		recordParser.addMappedField("ENTRY-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("EDIT-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("CALC-RDD"	,7,new JulianDateProcessor());
		recordParser.addMappedField("BUY-COMP-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("FUT-FRZ-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("ZONE"	,3);
		recordParser.addMappedField("PRI-GROUP"	,1);		
	}
	
	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.mapping.RecordParserFactory#getRecordParser()
	 */
	@Override
	public RecordParser getRecordParser() {
		return this.recordParser;
	}

}
