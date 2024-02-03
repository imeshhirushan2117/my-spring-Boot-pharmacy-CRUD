package lk.pharmacy.demo.repo;

import lk.pharmacy.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Imesh Hirushan
 * Project Name : demo
 * Package Name : lk.pharmacy.demo.repo
 * Date : Feb 3, 2024
 * Time : 9:31 PM
 */

public interface CustomerRepo extends JpaRepository <Customer, Long> {

}
