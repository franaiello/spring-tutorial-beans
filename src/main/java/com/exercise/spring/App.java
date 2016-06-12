package com.exercise.spring;

import com.exercise.spring.pojo.FruitBasket;
import com.exercise.spring.pojo.Jungle;
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

        // Fruit basket - which contains a list in constructor arg
        FruitBasket basket = (FruitBasket) context.getBean("basket");
        System.out.println(basket);

        // Proves that I can light up the customers bean while it injects the inner-beans
        Customers customers = (Customers) context.getBean("customers");
//        Customer customer1 = (Customer) context.getBean("customer1");
//        Customer customer2 = (Customer) context.getBean("customer2");
//        customers.addCustomer(customer1);
//        customers.addCustomer(customer2);
        customers.listCustomers();

        Jungle jungle = (Jungle) context.getBean("jungle");
        System.out.println(jungle);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
