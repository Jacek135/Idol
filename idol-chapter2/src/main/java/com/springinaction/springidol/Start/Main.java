package com.springinaction.springidol.Start;

import com.springinaction.springidol.Exception.PerformanceException;
import com.springinaction.springidol.Implementation.PoeticJuggler;
import com.springinaction.springidol.Interface.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerformanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Performer poeticJunggler = (PoeticJuggler) ctx.getBean("poeticJuggler");
        poeticJunggler.perform();

        ((ConfigurableApplicationContext) ctx).close();
    }
}
