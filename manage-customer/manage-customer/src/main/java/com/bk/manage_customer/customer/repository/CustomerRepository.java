package com.bk.manage_customer.customer.repository;

import com.bk.manage_customer.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
