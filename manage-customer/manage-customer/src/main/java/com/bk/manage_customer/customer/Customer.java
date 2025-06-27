package com.bk.manage_customer.customer;

import jakarta.validation.constraints.Size;

public class Customer {

    private long id;

    @Size(min = 2,max = 50 ,message = ErrorMessages.INVALID_FIRSTNAME_LENGTH)
    private String firstname;

    @Size(min = 2,max = 50 ,message = ErrorMessages.INVALID_LASTNAME_LENGTH)
    private String lastname;
    private String gender;
    private Address address;
    private ContactDetails contactDetails;

    public Customer(long id, String firstname, String lastname, String gender, Address address, ContactDetails contactDetails) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    public long getId() {
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

    public void setId(long id) {
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

