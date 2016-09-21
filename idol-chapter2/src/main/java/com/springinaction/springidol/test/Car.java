package com.springinaction.springidol.test;

public class Car {
    private String country;
    private int established;
    private final int acceleration = 10;

    public Car() {
    }

    public Car(String country, int established) {
        this.country = country;
        this.established = established;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public int timeForVelocity(int velocity){
        return velocity/acceleration;
    }

    public StringBuilder getDescription(){
        StringBuilder sb =  new StringBuilder();

        sb.append("KRAJ POCHODZENIA: " + country);
        sb.append(" ROK ZALOZENIA: " + established + "\n");

        return sb;
    }
}