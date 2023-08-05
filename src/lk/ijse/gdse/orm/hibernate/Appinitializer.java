package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.ripository.CustomrtRipository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {
    public static void main(String[] args) {
        Customer customer = getCustomer();


        // for save customer
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        cusRepo.saveCustomer(customer);

        // for get customer
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        Customer existCus=cusRepo.getCustomer(434);
//        System.out.println(existCus);

        // save and get
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        int saveCusId=cusRepo.saveCustomer(customer);
//        System.out.println("save cus id=" + saveCusId);
//
//        cusRepo=new CustomrtRipository();
//        Customer existCus=cusRepo.getCustomer(434);
//        System.out.println(existCus);


        //1.save
//        Session session=SessionFactoryConfig.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        session.save(customer);
//        transaction.commit();
//        session.close();



        //2.get & update
    /*    Session session1=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction1=session1.beginTransaction();
        Customer customer1 = session1.get(Customer.class, 1);
        customer1.setAddress("mathara");
        customer1.setName("nimal");
//        session1.save(customer1);
        session1.update(customer1);
        transaction1.commit();
        session1.close();
     */
        //4.Delete
//        Session deleteSession=SessionFactoryConfig.getInstance().getSession();
//        Transaction deleteTransaction =deleteSession.beginTransaction();
//        Customer deleteCustomer=deleteSession.get(Customer.class, 1);
//        deleteSession.delete(deleteCustomer);
//        deleteTransaction.commit();
//        deleteSession.close();
    }

    private static Customer getCustomer() {
        Customer customer=new Customer();
        customer.setName("aa");
        customer.setId(5555);
        customer.setAddress("wedfw");
        return customer;
    }
}
