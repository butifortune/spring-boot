package com.bk.manage_customer.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Setter;

@Entity
public class Address {
    @Setter
    @Id
    @GeneratedValue
    private Long id;
    private int streetNumber;

   @Size(min = 2, message = ErrorMessages.INVALID_STREET_NAME)
    private String streetName;
    private String City;
    private String Province;
    @Pattern(regexp = "^\\d{4}$", message = ErrorMessages.INVALID_POSTAL_CODE)
    private int code;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Address() {
    }

    public Address(int streetNumber, String streetName, String city, String province, int code) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        City = city;
        this.code = code;
        Province = province;
    }

    public Long getAddressId() {
        return id;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return City;
    }

    public String getProvince() {
        return Province;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", City='" + City + '\'' +
                ", Province='" + Province + '\'' +
                ", code=" + code +
                '}';
    }
}
