package com.springinaction.spitter.Spring;

import com.springinaction.spitter.Config.SpitterConfig;
import com.springinaction.spitter.User.Services.SpitterService;
import com.springinaction.spitter.User.dao.implementation.UserDao;
import com.springinaction.spitter.User.model.Spitter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Module.xml");
            SpitterService spitterService = (SpitterService) ctx.getBean("spitterService");
//            UserDao userDao = (UserDao) ctx1.getBean("userDao");
//            AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();

//            ctx1.register(SpitterConfig.class);
//            ctx1.refresh();

            Spitter spitter = (Spitter) ctx.getBean("customer2");
//            Spitter spitter1 = (Spitter) ctx1.getBean("customer2");

            spitterService.addSpitter(spitter);
            List<Spitter> spitterList = spitterService.fetchAllSpitters();

            System.out.println("THE LIST OF SPITTERS:");
            for (Spitter spitter1 : spitterList){
                System.out.println(spitter1.toString());
            }

//            System.out.println("The list of all Spitters: " + spitterList);

            ((ConfigurableApplicationContext) ctx).close();
//            ctx1.close();
        } catch (Exception ex) {
            System.out.println("ZLE POSZLO, COS JEST NIE TAK");
            System.out.println(ex.toString());
        }
    }

}