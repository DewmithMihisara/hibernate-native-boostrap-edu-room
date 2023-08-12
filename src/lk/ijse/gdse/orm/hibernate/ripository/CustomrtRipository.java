package lk.ijse.gdse.orm.hibernate.ripository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer1;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomrtRipository {
    private final Session session;
    public CustomrtRipository(){
        session= SessionFactoryConfig.getInstance().getSession();
    }
    public Customer1 getCustomer(int id){
        try {
            return session.get(Customer1.class,id);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public int saveCustomer(Customer1 customer1){
        Transaction transaction=session.beginTransaction();
        try {
            int cusId=(int)session.save(customer1);
            transaction.commit();
            return cusId;
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return -1;
        }finally {
            session.close();
        }

    }
    public boolean updateCustomer(Customer1 customer1){
        Transaction transaction=session.beginTransaction();
        try {
            session.update(customer1);
            transaction.commit();
            return true;
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }

    }
    public boolean deleteCustomer(Customer1 customer1){
        Transaction transaction=session.beginTransaction();
        try {
            session.delete(customer1);
            transaction.commit();
            return true;
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }
    }
}
