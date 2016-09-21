package com.springinaction.springidol.Implementation;

import com.springinaction.springidol.Exception.PerformanceException;
import com.springinaction.springidol.Interface.Performer;
import com.springinaction.springidol.test.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class Juggler implements Performer{
    private int beanBags = 3;

    @Autowired
    private Car car;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
        System.out.println("CZAS POTRZEBNY TO: " + car.timeForVelocity(100));
        car.setCountry("POLSKA");
        car.setEstablished(1984);
        System.out.println("PELNE DANE: " + car.getDescription());
    }



}
