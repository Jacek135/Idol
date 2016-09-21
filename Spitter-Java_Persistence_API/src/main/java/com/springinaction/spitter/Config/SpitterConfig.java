package com.springinaction.spitter.Config;

import com.springinaction.spitter.User.model.Spitter;
import com.springinaction.spitter.test.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpitterConfig {

    @Bean(name = "Pisarz")
    public Writer writer() {
        return new Writer();
    }

    @Bean(name = "customer1")
    public Spitter getSpitter() {
        Spitter spitter = new Spitter();
        spitter.setUserName("Jacek1");
        spitter.setPassword("aaaa");
        spitter.setFullName("Jaeck1 Karas Begin");
        return spitter;
    }

    @Bean(name = "customer2")
    public Spitter getSpitter2() {
        Spitter spitter = new Spitter();
        spitter.setUserName("Ala");
        spitter.setPassword("bbb");
        spitter.setFullName("Ala Ola Ewa");
        return spitter;
    }

}
