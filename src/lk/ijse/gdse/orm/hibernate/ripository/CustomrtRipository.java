package lk.ijse.gdse.orm.hibernate.ripository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomrtRipository {
    private final Session session;
    public CustomrtRipository(){
        session= SessionFactoryConfig.getInstance().getSession();
    }
    public Customer getCustomer(int id){
        return session.get(Customer.class,id);
    }
    public int saveCustomer(Customer customer){
        Transaction transaction=session.beginTransaction();

        int cusId=(int)session.save(customer);
        transaction.commit();
        session.close();

        return cusId;
    }
}
