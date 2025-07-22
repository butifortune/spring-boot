package com.bk.manage_customer.customer.dto;

public class CustomerDto {

      private Long id;
      private String firstname;
      private String lastname;
      private String gender;
      private AddressDto address;
      private Contact_DetailsDto contactDetails;

    public CustomerDto(Long id, String firstname, String lastname, String gender, AddressDto address, Contact_DetailsDto contactDetails) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Contact_DetailsDto getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Contact_DetailsDto contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
