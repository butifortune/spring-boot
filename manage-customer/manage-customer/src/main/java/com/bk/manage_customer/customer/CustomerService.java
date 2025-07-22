package com.bk.manage_customer.customer;

import com.bk.manage_customer.customer.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
    CustomerDto getCustomerById(long id);
    void deleteById(long id);
    Customer save(Customer customer);

}
