package lk.pharmacy.demo.controller;


import lk.pharmacy.demo.dto.CustomerDto;
import lk.pharmacy.demo.entity.Customer;
import lk.pharmacy.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : demo
 * Package Name : lk.pharmacy.demo.controller
 * Date : Feb 3, 2024
 * Time : 9:25 PM
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServices services;

    @Autowired
    public CustomerController(CustomerServices services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDto dto){
        Customer saved = services.save(dto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomer(){
        List<Customer> customer = services.getCustomer();
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<String> deletedCustomer(@PathVariable Long customerId){
        String deleted = services.deletedCustomer(customerId);
        return new ResponseEntity<>(deleted,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerId ,@RequestBody CustomerDto dto){
        Customer customer = services.customerUpdate(customerId, dto);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }


}
