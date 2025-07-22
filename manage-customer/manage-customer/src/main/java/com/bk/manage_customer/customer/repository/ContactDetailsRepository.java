package com.bk.manage_customer.customer.repository;

import com.bk.manage_customer.customer.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {
}
