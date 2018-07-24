package com.juliano.carbonara.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Local(CarbonaraSessionBeanDefaultLocal.class)
@Remote(CarbonaraSessionBeanDefaultRemote.class)
public class CarbonaraSessionBeanDefault implements
        CarbonaraSessionBeanDefaultLocal, CarbonaraSessionBeanDefaultRemote {

    @Override
    public String sayHello(String nome) {
        return String.format("Hello %s", nome);
    }

}
