/*
 * @(#)ZkpRecordParserFactory.java			Mar 7, 2013	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1.wdc.parsing;


/**
 * <code>ZkpRecordParserFactory</code>
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ZkpRecordParserFactory implements RecordParserFactory {

		
		private RecordParser recordParser = new RecordParser();{
			recordParser.addMappedField("ZOR-DOC-NUM"	,14);
			recordParser.addMappedField("SUFFIX"	,1);
			recordParser.addMappedField("OUTPUT-ID"	,1);
		}
		
		/* (non-Javadoc)
		 * @see gov.gsa.fas.services.order.v1.wdc.mapping.RecordParserFactory#getRecordParser()
		 */
		@Override
		public RecordParser getRecordParser() {
			return this.recordParser;
		}

}
