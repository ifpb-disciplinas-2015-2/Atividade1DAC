package com.mycompany.media_aritimetica_jse;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author kaique
 */
public class ServiceLocator {

    protected <T> T lookup(String recurso, Class<T> tipo) {
        try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "con.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("org.omg.COBRA.ORBInitiaHost", "localhost");
            props.setProperty("org.omg.COBRA.ORBInitiaPort", "3700");
            InitialContext context = new InitialContext(props);
            return (T) context.lookup(recurso);
        } catch (NamingException ne) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, "exeption caught", ne);
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }
}
