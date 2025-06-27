package com.bk.manage_customer.customer;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//@AllArgsConstructor
public class ContactDetails {

    private String cell;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", message = ErrorMessages.INVALID_EMAIL_ADDRESS)
    private String email;

    public ContactDetails(String cell, String email) {
        this.cell = cell;
        this.email = email;
    }
}
