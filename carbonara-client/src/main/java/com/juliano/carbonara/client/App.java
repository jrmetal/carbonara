package com.juliano.carbonara.client;

import com.juliano.carbonara.ejb.CarbonaraSessionBeanDefaultRemote;
import java.util.Hashtable;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class App {

    private CarbonaraSessionBeanDefaultRemote demoBeanDefaultRemote;

    final Properties jndiProps = new Properties();

    public CarbonaraSessionBeanDefaultRemote getRemoteService() throws NamingException {

        jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

        String name = "ejb:/carbonara-ejb-1.0.0-jar-with-dependencies//"
                + "CarbonaraSessionBeanDefault!"
                + "com.juliano.carbonara.ejb.CarbonaraSessionBeanDefaultRemote";

        return (CarbonaraSessionBeanDefaultRemote) new InitialContext(jndiProps)
                .lookup(name);
    }

    public static void main(String[] args) {
        App demoEJB = new App();

        try {
            CarbonaraSessionBeanDefaultRemote remoteService
                    = demoEJB.getRemoteService();

            System.out.println(remoteService.sayHello("Juliano"));

        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

}
