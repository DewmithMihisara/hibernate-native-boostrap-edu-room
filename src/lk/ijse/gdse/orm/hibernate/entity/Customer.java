package lk.ijse.gdse.orm.hibernate.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//type 1. @Entity(name = "customer")
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_Id")
    private int id;
    @Column(name ="cutomer_name")
    private String name;
    @Column(name="customer_address")
    private String address;
    @Column(name = "customer_salary")
    private double salary;

}
