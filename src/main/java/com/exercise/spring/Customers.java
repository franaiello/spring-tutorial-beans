package com.exercise.spring;

import com.exercise.spring.pojo.Customer;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    List<Customer> customers=null;

    public Customers() {
        customers = new ArrayList<Customer>();
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void listCustomers() {
        for (Customer cust : customers) {
            System.out.println(cust);
        }
    }
}
