/*
 * @(#)TransactionPersistenceTest.java			Jun 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy;

import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistenceException;
import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistenceImpl;

import org.apache.log4j.BasicConfigurator;

/**
 * <code>TransactionPersistenceTest.java</code>
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     
 */

public class TransactionPersistenceTest {

	public void testCreateZkpTransaction(){
		TransactionPersistenceImpl transPersImpl = new TransactionPersistenceImpl();
		ZkpTransaction zkpRecord = TransactionPersistenceTestData.createZkpTestRecord();
		try {
			boolean isSuccess = transPersImpl.createZkp(zkpRecord);
			System.out.println("Is Zkp Persistence Successful->" + isSuccess);
		} catch (TransactionPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	public void testCreateFinance305Transaction(){
		TransactionPersistenceImpl transPersImpl = new TransactionPersistenceImpl();
		Finance305Transaction fin305Record = TransactionPersistenceTestData.createFinance305TestRecord();
		try {
			boolean isSuccess = transPersImpl.createFinance305(fin305Record);
			System.out.println("Is Finance305 Persistence Successful->" + isSuccess);
		} catch (TransactionPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	public void testCreateReshipmentTransaction(){
		TransactionPersistenceImpl transPersImpl = new TransactionPersistenceImpl();
		ReshipmentTransaction reshipRecord = TransactionPersistenceTestData.createReshipmentTestRecord();
		try {
			boolean isSuccess = transPersImpl.createReshipment(reshipRecord);
			System.out.println("Is Reshipment Persistence Successful->" + isSuccess);
		} catch (TransactionPersistenceException e) {
			e.printStackTrace();
		}
	}	
	
	public void testMaterialReturnTransaction(){
		TransactionPersistenceImpl transPersImpl = new TransactionPersistenceImpl();
		MaterialReturnTransaction mrRecord = TransactionPersistenceTestData.createMaterialReturnTestRecord();
		try {
			boolean isSuccess = transPersImpl.createMaterialReturn(mrRecord);
			System.out.println("Is Material Return Persistence Successful->" + isSuccess);
		} catch (TransactionPersistenceException e) {
			e.printStackTrace();
		}
	}		
	
	public static void main(String args[]){
		BasicConfigurator.configure();
		TransactionPersistenceTest test = new TransactionPersistenceTest();
//		test.testCreateZkpTransaction();
//		test.testCreateFinance305Transaction();
//		test.testCreateReshipmentTransaction();
		test.testMaterialReturnTransaction();
	}
}
