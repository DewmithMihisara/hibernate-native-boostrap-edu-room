package lk.ijse.gdse.orm.hibernate.config;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;
    private SessionFactoryConfig(){}
    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?factoryConfig=new SessionFactoryConfig():factoryConfig;
    }
    public Session getSession(){
        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
    }
}
