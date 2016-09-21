package com.springinaction.springidol.Config;

import com.springinaction.springidol.test.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car car(){
        return new Car();
    }
}
