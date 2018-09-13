/*
 * @(#)OrderPersistenceLocal.java			Feb 29, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.service;

import javax.ejb.Local;


/**
 * <code>OrderPersistenceLocal</code> is the local EJB interface for 
 * Order persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see  		gov.gsa.fas.persistence.order.serviceOrderPersistence   
 */

@Local
public interface OrderPersistenceLocal extends OrderPersistence {

}
