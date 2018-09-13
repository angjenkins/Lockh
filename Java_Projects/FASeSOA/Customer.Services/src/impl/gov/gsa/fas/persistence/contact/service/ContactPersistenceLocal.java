/*
 * @(#)ContactPersistenceLocal.java			Mar 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.contact.service;

import javax.ejb.Local;

/**
 * <code>ContactPersistenceLocal</code> is the local EJB interface for 
 * Customer Contact persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see 		gov.gsa.fas.persistence.contact.service.ContactPersistence
 */
@Local
public interface ContactPersistenceLocal extends ContactPersistence{

}
