package com.juliano.carbonara.utilities.entity;

import com.juliano.carbonara.ejb.persistence.remote.EntityPersistRemote;
import com.juliano.carbonara.utilities.ejb.EjbUtil;
import javax.naming.NamingException;

/**
 * Class to assistant Entity components.
 *
 * @author juliano
 */
public class EntityUtil {

    /**
     * TODO
     *
     * @param entity
     * @throws NamingException
     */
    public void createNewEntity(Object entity) throws NamingException {
        EjbUtil demoEJB = new EjbUtil();

        EntityPersistRemote remoteService
                = demoEJB.getRemoteService();

        remoteService.create(entity);
    }
}
