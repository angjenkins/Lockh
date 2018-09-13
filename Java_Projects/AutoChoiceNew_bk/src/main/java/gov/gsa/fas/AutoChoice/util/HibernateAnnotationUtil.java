/**
 * 
 */
package gov.gsa.fas.AutoChoice.util;

import org.hibernate.SessionFactory;
import org.hibernate.connection.C3P0ConnectionProvider;
import org.hibernate.connection.ConnectionProvider;
import org.hibernate.impl.SessionFactoryImpl;

/**
 * @author KarunakarChatla
 *
 */
public class HibernateAnnotationUtil {
private static final SessionFactory sessionFactory;


    
    static {
		try {
	 	 sessionFactory = new org.hibernate.cfg.AnnotationConfiguration().
	 			configure().buildSessionFactory();
		} catch (Throwable ex) {
		// Log exception!
		   throw new ExceptionInInitializerError(ex);
		}
	}

    
    

    public static SessionFactory getSessionFactory() {
    	
//    	
//    	 Configuration configuration = new Configuration();
//    	    configuration.configure();
//    	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//    	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    
    public static void close() {
        if(sessionFactory instanceof SessionFactoryImpl) {
              SessionFactoryImpl sf = (SessionFactoryImpl)sessionFactory;
              ConnectionProvider conn = sf.getConnectionProvider();
              if(conn instanceof C3P0ConnectionProvider) { 
                ((C3P0ConnectionProvider)conn).close(); 
              }
           }
        sessionFactory.close();
    }
}
