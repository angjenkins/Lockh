/*
 * @(#)ComplaintPersistenceLocal.java			Aug 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.complaint.service;

import javax.ejb.Local;

/**
 * <code>ComplaintPersistenceLocal</code> is the local EJB interface for 
 * OrderComplaint persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see   	gov.gsa.fas.persistence.order.complaint.service.ComplaintPersistence  
 */

@Local
public interface ComplaintPersistenceLocal 
						extends ComplaintPersistence {

}
