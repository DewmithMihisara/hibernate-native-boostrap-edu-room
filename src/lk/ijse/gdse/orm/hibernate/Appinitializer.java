package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import org.hibernate.Session;

public class Appinitializer {
    public static void main(String[] args) {
        Session session=SessionFactoryConfig.getInstance().getSession();
    }
}
