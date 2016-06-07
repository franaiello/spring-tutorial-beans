package com.exercise.spring;

public class Person {
    private int id;
    private String name;

    private Integer taxId;

    private Address address;

    public Person() {

    }

    public static Person getInstance(Integer id, String name) {
        System.out.println("Creating a person object using Factory method");
        return new Person(id, name);
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello! I'm a person");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void onDestroy() {
        System.out.println("Person destroyed: " + this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
