package com.bk.manage_customer.customer;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 2,max = 50 ,message = ErrorMessages.INVALID_FIRSTNAME_LENGTH)
    private String firstname;

    @Size(min = 2,max = 50 ,message = ErrorMessages.INVALID_LASTNAME_LENGTH)
    private String lastname;
    private String gender;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "address",
            joinColumns =
                    { @JoinColumn(name = "customer_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "address_id", referencedColumnName = "id") })
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private ContactDetails contactDetails;

    public Customer() {
    }

    public Customer(Long id, String firstname, String lastname, String gender, Address address, ContactDetails contactDetails) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", contactDetails=" + contactDetails +
                '}';
    }
}

