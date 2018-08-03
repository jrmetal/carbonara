package com.juliano.carbonara.ejb.persistence;

import com.juliano.carbonara.entities.persistence.Bairro;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.juliano.carbonara.ejb.persistence.remote.EntityPersistLocal;
import com.juliano.carbonara.ejb.persistence.remote.EntityPersistRemote;

/**
 * Generic class to persist entities.
 *
 * @author juliano
 * @param <Entity> Entity to given
 */
@Stateless
@Remote(EntityPersistRemote.class)
@Local(EntityPersistLocal.class)
public class EntityPersist implements EntityPersistRemote,
        EntityPersistLocal {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.juliano.carbonara");
    EntityManager em = emf.createEntityManager();

    /**
     * {@inheritDoc}
     */
    @Override
    public void create(Object entity) {

        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();

        } finally {
            em.close();
        }
    }

}
