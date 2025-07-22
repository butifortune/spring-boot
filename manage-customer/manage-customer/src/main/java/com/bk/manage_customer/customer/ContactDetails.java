package com.bk.manage_customer.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.ToString;

//@Getter
//@ToString
//@AllArgsConstructor
@Entity
public class ContactDetails {

    @GeneratedValue
    @Id
    Long id;

    private String cell;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", message = ErrorMessages.INVALID_EMAIL_ADDRESS)
    private String email;

   // @OneToOne(mappedBy = "contactDetails")
    //private Customer customer;

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public ContactDetails() {
    }

    public ContactDetails(String cell, String email) {
        this.cell = cell;
        this.email = email;
    }

    public Long getContactId() {
        return id;
    }

    public void setContactId(Long id) {
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
        return "ContactDetails{" +
                "id=" + id +
                ", cell='" + cell + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
