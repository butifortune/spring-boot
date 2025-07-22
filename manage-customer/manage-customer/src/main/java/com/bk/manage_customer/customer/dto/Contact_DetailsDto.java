package com.bk.manage_customer.customer.dto;

import com.bk.manage_customer.customer.ErrorMessages;
import jakarta.validation.constraints.Pattern;

public class Contact_DetailsDto {
    Long id;
    private String cell;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", message = ErrorMessages.INVALID_EMAIL_ADDRESS)
    private String email;

    public Contact_DetailsDto(Long id, String cell, String email) {
        this.id = id;
        this.cell = cell;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact_DetailsDto{" +
                "id=" + id +
                ", cell='" + cell + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
