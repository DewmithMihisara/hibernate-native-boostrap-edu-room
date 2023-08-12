package lk.ijse.gdse.orm.hibernate.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//type 1. @Entity(name = "customer")
@Entity
@Table(name = "customer")
public class Customer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_Id")
    private int id;
    @Column(name ="cutomer_name")
    private String name;
    @Column(name="customer_address")
    private String address;
    @Column(name = "customer_salary")
    private double salary;
    @Column(name = "no", columnDefinition = "TinyInt")
    private int no;

}
