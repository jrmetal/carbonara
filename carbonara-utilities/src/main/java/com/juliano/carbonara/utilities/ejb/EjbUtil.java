package com.juliano.carbonara.utilities.ejb;

import com.juliano.carbonara.ejb.persistence.remote.EntityPersistRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Class to assistant EJB components.
 *
 * @author juliano
 */
public class EjbUtil {

    private EntityPersistRemote beanDefaultRemote;

    final Properties jndiProps = new Properties();

    /**
     * TODO.
     *
     * @return
     * @throws NamingException
     */
    public EntityPersistRemote getRemoteService() throws NamingException {

        jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

        String name = "ejb:/carbonara-ejb-1.0.0-jar-with-dependencies//"
                + "EntityPersist!com.juliano.carbonara.ejb.persistence.remote."
                + "EntityPersistRemote";

        beanDefaultRemote = (EntityPersistRemote) new InitialContext(jndiProps)
                .lookup(name);

        return beanDefaultRemote;
    }

}
