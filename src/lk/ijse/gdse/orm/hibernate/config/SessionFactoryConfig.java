package lk.ijse.gdse.orm.hibernate.config;

import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){
        StandardServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
//                .applyImplicitNamingStrategy(
//                        ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();
        sessionFactory = metadata
                .buildSessionFactory();
    }
    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?factoryConfig=new SessionFactoryConfig():factoryConfig;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
