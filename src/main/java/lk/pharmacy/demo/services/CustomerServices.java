package lk.pharmacy.demo.services;


import lk.pharmacy.demo.dto.CustomerDto;
import lk.pharmacy.demo.entity.Customer;
import lk.pharmacy.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created By Imesh Hirushan
 * Project Name : demo
 * Package Name : lk.pharmacy.demo.services
 * Date : Feb 3, 2024
 * Time : 9:26 PM
 */


@Service
public class CustomerServices {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServices(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer save(CustomerDto dto) {
       return customerRepo.save(new Customer(dto.getName(),dto.getAddress(),dto.getSalary()));
    }

    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    public String deletedCustomer(Long customerId) {
        if (customerRepo.existsById(customerId)){
            customerRepo.deleteById(customerId);
            return "Customer Deleted!";
        }
        return "No Customer Found!";
    }


    public Customer customerUpdate(Long customerId, CustomerDto dto) {
        if(customerRepo.existsById(customerId)){
            return customerRepo.save(new Customer(customerId, dto.getName(),dto.getAddress(),dto.getSalary()));
        }return null;
    }

    public Customer searchCustomerById(Long customerId) {
        Optional<Customer> byId = customerRepo.findById(customerId);
        return byId.orElse(null);
    }

    public Customer searchByName(String customerName) {
        return customerRepo.findCustomerByName(customerName);
    }


}
