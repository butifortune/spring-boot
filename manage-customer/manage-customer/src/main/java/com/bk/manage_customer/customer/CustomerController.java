package com.bk.manage_customer.customer;

import com.bk.manage_customer.customer.dto.CustomerDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

//    @GetMapping("/customers")
//    public List<Customer> getAllCustomers() {
//        return customerService.findAll();
//    }

    @GetMapping("/customers/{id}")
    public CustomerDto getCustomerById(@PathVariable long id) {
        CustomerDto customer = customerService.getCustomerById(id);
        if (customer == null || customer.getId() != id)
            throw new CustomerNotFoundException(ErrorMessages.CUSTOMER_NOT_FOUND);
        return customer;
    }

//    @DeleteMapping("/customers/{id}")
//    public ResponseEntity<HttpStatus> deleteCustomerById(@PathVariable long id) {
//        CustomerDto customer = customerService.getCustomerById(id);
//        if (customer == null)
//            throw new CustomerNotFoundException(ErrorMessages.CUSTOMER_NOT_FOUND);
//        customerService.deleteById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PostMapping("/customers")
//    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
//        Customer saveCustomer = customerService.save(customer);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(saveCustomer.getId()).toUri();
//        return ResponseEntity.created(location).build();
//    }
}
