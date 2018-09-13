/*
 * @(#)VendorPersistenceLocal.java			Aug 21, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.service;

import javax.ejb.Local;

/**
 * <code>VendorPersistenceLocal</code> is the local EJB interface for 
 * Vendor persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     gov.gsa.fas.persistence.vendor.service.VendorPersistence
 */

@Local
public interface VendorPersistenceLocal extends VendorPersistence {

}
