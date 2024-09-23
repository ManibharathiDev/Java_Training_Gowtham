package org.example;

public abstract class Car {

    Car(){
        System.out.println("Constructor is created");
    }

    abstract void getBrand();

    public void setColor(){
        System.out.println("Red");
    }
}
