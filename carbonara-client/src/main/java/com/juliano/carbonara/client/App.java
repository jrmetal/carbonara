package com.juliano.carbonara.client;

import com.juliano.carbonara.entities.persistence.Bairro;
import javax.naming.NamingException;
import com.juliano.carbonara.ejb.persistence.remote.EntityPersistRemote;
import com.juliano.carbonara.utilities.ejb.EjbUtil;
import com.juliano.carbonara.utilities.entity.EntityUtil;

public class App {

    public static void main(String[] args) throws NamingException {

        Bairro bairro = new Bairro();

        bairro.setNome("Ipanema");
        bairro.setStatus('A');

        EntityUtil entityUtil = new EntityUtil();

        entityUtil.createNewEntity(bairro);

    }
}
