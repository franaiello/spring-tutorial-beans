package com.exercise.spring;

public class Address {
    private String street;
    private String postalCode;

    public Address() {

    }

    public Address(String street, String postalCode) {
        this.street = street;
        this.postalCode = postalCode;
    }

    public static Address getInstance(String street, String postalCode) {
        System.out.println("Creating an Address object using Factory method");
        return new Address(street, postalCode);
    }

    public void init() {
        System.out.println("Bean created: " + this);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
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
