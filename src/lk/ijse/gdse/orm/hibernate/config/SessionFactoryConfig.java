package lk.ijse.gdse.orm.hibernate.config;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;
    private SessionFactoryConfig(){

    }
    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?factoryConfig=new SessionFactoryConfig():factoryConfig;
    }
}
