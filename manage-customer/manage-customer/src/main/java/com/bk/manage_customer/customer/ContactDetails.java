package com.bk.manage_customer.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//@AllArgsConstructor
public class ContactDetails {

    private String cell;
    private String email;

    public ContactDetails(String cell, String email) {
        this.cell = cell;
        this.email = email;
    }
}
