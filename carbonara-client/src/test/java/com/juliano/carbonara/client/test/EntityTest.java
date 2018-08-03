package com.juliano.carbonara.client.test;

import com.juliano.carbonara.entities.persistence.Bairro;
import com.juliano.carbonara.utilities.entity.EntityUtil;
import javax.naming.NamingException;
import org.junit.Test;

/**
 * class to test entity Bairro.
 *
 * @author juliano
 */
public class EntityTest {

    public static void main(String[] args) throws NamingException {

    }

    @Test
    public void testNewEntity() throws NamingException {
        Bairro bairro = new Bairro();

        bairro.setNome("Ipanema");
        bairro.setStatus('A');

        EntityUtil entityUtil = new EntityUtil();

        entityUtil.createNewEntity(bairro);
    }
}
