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

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Module.xml");
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();

        ctx1.register(SpitterConfig.class);
        ctx1.refresh();

        Spitter spitter =(Spitter)ctx1.getBean("customer1");

        UserDAO userDAO = (UserDAO) ctx.getBean("userInsert");

        userDAO.insertSpitter(spitter);
//        Spitter spitter1 = userDAO.findBySpitterId(1);
        System.out.println(spitter.toString());

        ((ConfigurableApplicationContext) ctx).close();
        ctx1.close();
    }

}