package com.exercise.spring.pojo;

public class Customer {
    private Integer customerNo=null;
    private String customerFirstName=null;
    private String customerLastName=null;

    public Customer(final Integer customerNo, final String customerFirstName, final String customerLastName) {
        this.customerNo = customerNo;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNo=" + customerNo +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                '}';
    }
}
