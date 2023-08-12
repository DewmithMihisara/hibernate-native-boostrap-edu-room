package lk.ijse.gdse.orm.hibernate.entity;

import javafx.scene.Scene;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_1")
public class Customer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private int id;
    @Column(name = "cus_name")
    private String name;
    @Column(name = "cus_address")
    private String address;
    @Column(name = "cus_age")
    private int age;
    @Column(name = "cus_salary")
    private double salary;
}
