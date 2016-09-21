package com.springinaction.spitter.Spring;

import com.springinaction.spitter.Config.SpitterConfig;
import com.springinaction.spitter.User.dao.UserDAO;
import com.springinaction.spitter.User.model.Spitter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Module.xml");
            AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();

            ctx1.register(SpitterConfig.class);
            ctx1.refresh();

            Spitter spitter = (Spitter) ctx1.getBean("customer1");
            Spitter spitter1 = (Spitter) ctx1.getBean("customer2");

            UserDAO userDAO = (UserDAO) ctx.getBean("userInsert");

            userDAO.addSpitter(spitter);

//            Spitter spitter2 = userDAO.getSpitterById(1);
//            System.out.println(spitter2.toString());

//            userDAO.updateSpitter(spitter1);

            ((ConfigurableApplicationContext) ctx).close();
            ctx1.close();
        } catch (Exception ex) {
            System.out.println("ZLE POSZLO, COS JEST NIE TAK");
        }
    }

}