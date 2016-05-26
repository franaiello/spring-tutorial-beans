package com.exercise.spring;

/**
 * Created by francisaiello on 5/25/16.
 */
public class Address {
    private String street;
    private String postalCode;

    public Address(String street, String postalCode) {
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
