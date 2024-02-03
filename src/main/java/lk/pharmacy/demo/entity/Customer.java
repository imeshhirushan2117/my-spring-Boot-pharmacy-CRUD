package lk.pharmacy.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Created By Imesh Hirushan
 * Project Name : demo
 * Package Name : lk.pharmacy.demo.entity
 * Date : Feb 3, 2024
 * Time : 9:21 PM
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private double salary;

    public Customer(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
