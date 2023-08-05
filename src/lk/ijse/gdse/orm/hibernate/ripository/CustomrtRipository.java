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
        try {
            return session.get(Customer.class,id);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public int saveCustomer(Customer customer){
        Transaction transaction=session.beginTransaction();
        try {
            int cusId=(int)session.save(customer);
            transaction.commit();
            session.close();
            return cusId;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return -1;
        }

    }
    public boolean updateCustomer(Customer customer){
        Transaction transaction=session.beginTransaction();

        session.update(customer);
        transaction.commit();
        session.close();
        return true;
    }
    public boolean deleteCustomer(Customer customer){
        Transaction transaction=session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();
        return true;
    }
}
