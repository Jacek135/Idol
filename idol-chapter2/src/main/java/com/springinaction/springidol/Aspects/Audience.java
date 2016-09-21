package com.springinaction.springidol.Aspects;

import org.aspectj.lang.annotation.*;

//@Aspect
public class Audience {

    @Pointcut(
            "execution(* com.springinaction.springidol.Interface.Performer.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void takeSeats(){
        System.out.println("The audience is taking their seats");
    }

    @Before("performance()")
    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Boo! We want our money back!!!");
    }

}
