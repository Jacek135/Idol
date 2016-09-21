package com.springinaction.spitter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main (String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonService personService = (PersonService) context.getBean("personService");

        Person person = new Person();
        person.setName("Jacek");
        person.setEmail("Jacek@gmail.com");
        personService.addPerson(person);

        System.out.println("Person : " + person + " added successfully");

        List<Person> persons = personService.fetchAllPersons();
        System.out.println("The list of all persons: " + persons);

    }
}
