package com.exercise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Spring Bean Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person1 = (Person) context.getBean("person");

        person1.setTaxId(1234);
        person1.setName("Francis");

        System.out.println(person1);

//        Address address2 = (Address)context.getBean("address2");
//        System.out.println(address2);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
