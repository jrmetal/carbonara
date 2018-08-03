package com.juliano.carbonara.ejb.persistence.remote;

/**
 * interface remote to GenericEntityPersist.
 *
 * @author juliano
 */
public interface EntityPersistRemote {

    /**
     * method to persist object.
     *
     * @param entity to be persisting.
     */
    public void create(Object entity);

}
