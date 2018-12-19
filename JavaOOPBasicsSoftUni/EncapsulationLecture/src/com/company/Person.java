package com.company;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salery;
    private DecimalFormat format;

    public Person() {
        this.format = new DecimalFormat("#.0###############");
    }

    public Person(String firstName, String lastName, int age, double salery) {
        this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalery(salery);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public void increaseSalery(int bonus){
        if(this.getAge() < 30){
            this.setSalery(this.getSalery() + (this.getSalery() * bonus / 200));
        }else {
            this.setSalery(this.getSalery() + (this.getSalery() * bonus / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.getFirstName(),
                this.getLastName(),this.format.format(this.getSalery()));
    }
}
