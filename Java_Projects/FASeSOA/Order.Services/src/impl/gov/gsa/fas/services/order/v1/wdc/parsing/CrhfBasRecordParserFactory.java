/*
 * @(#)CrhfBasRecordParserFactory.java			Mar 7, 2013	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1.wdc.parsing;

import gov.gsa.fas.services.order.v1.wdc.parsing.prcs.JulianDateProcessor;

/**
 * <code>CrhfBasRecordParserFactory</code>
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class CrhfBasRecordParserFactory implements RecordParserFactory {

	
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
		
		recordParser.addMappedField("VARI1"	,14);
		recordParser.addMappedField("AGENCY"	,2);
		recordParser.addMappedField("BUREAU"	,2);
		recordParser.addMappedField("STATE"	,2);
		recordParser.addMappedField("CITY"	,4);
		recordParser.addMappedField("EXP-DOM"	,1);
		recordParser.addMappedField("INPUT-SRC"	,1);
		recordParser.addMappedField("CONSIGNEE"	,6);
		recordParser.addMappedField("CRP"	,6);
		recordParser.addMappedField("MAP-MARK-FOR"	,6);
		recordParser.addMappedField("EDI"	,4);
		recordParser.addMappedField("NAS"	,1);
		recordParser.addMappedField("NR-ACT-SEG"	,2);
		recordParser.addMappedField("BASE-SEG-IND"	,1);
		recordParser.addMappedField("QTY-REQD"	,5); //129 position
		recordParser.addMappedField("ENTRY-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("EDIT-DATE"	,7,new JulianDateProcessor());
		recordParser.addMappedField("TRANSFER-DATE"	,7,new JulianDateProcessor());		
		recordParser.addMappedField("ZONE"	,3);
		recordParser.addMappedField("PRI-GROUP"	,1);
		recordParser.addMappedField("FILLER"	,10);
	}
	
	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.order.v1.wdc.mapping.RecordParserFactory#getRecordParser()
	 */
	@Override
	public RecordParser getRecordParser() {
		return this.recordParser;
	}

}

