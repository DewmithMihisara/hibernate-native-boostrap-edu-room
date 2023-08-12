package lk.ijse.gdse.orm.hibernate.config;

import lk.ijse.gdse.orm.hibernate.entity.Customer1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){
//        sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder()
//                .configure()
//                .build())
//                .addAnnotatedClass(Customer.class)
//                .getMetadataBuilder()
//                .build().buildSessionFactory();
        sessionFactory=new Configuration()
                .configure()
                .addAnnotatedClass(Customer1.class)
                .buildSessionFactory();
    }
    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?factoryConfig=new SessionFactoryConfig():factoryConfig;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
