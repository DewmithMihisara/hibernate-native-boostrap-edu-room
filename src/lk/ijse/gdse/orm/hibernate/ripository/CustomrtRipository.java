package lk.ijse.gdse.orm.hibernate.ripository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;

public class CustomrtRipository {
    private final Session session;
    public CustomrtRipository(){
        session= SessionFactoryConfig.getInstance().getSession();
    }
    public Customer getCustomer(int id){
        return session.get(Customer.class,1);
    }
}
