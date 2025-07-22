package com.bk.manage_customer.customer.dto;

import com.bk.manage_customer.customer.ErrorMessages;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AddressDto {

    private Long id;
    private int streetNumber;
    @Size(min = 2, message = ErrorMessages.INVALID_STREET_NAME)
    private String streetName;
    private String City;
    private String Province;
    @Pattern(regexp = "^\\d{4}$", message = ErrorMessages.INVALID_POSTAL_CODE)
    private int code;

    public AddressDto(Long id, int streetNumber, String streetName, String city, String province, int code) {
        this.id = id;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        City = city;
        Province = province;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "id=" + id +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", City='" + City + '\'' +
                ", Province='" + Province + '\'' +
                ", code=" + code +
                '}';
    }
}
