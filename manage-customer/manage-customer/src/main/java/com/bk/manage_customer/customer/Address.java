package com.bk.manage_customer.customer;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Address {
    private int streetNumber;

   @Size(min = 2, message = ErrorMessages.INVALID_STREET_NAME)
    private String streetName;
    private String City;
    private String Province;
    @Pattern(regexp = "^\\d{4}$", message = ErrorMessages.INVALID_POSTAL_CODE)
    private int code;

    public Address(int streetNumber, String streetName, String city, String province, int code) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        City = city;
        this.code = code;
        Province = province;
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
