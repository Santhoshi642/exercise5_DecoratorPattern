package com.example.exercise4_DecoratorPattern;
public abstract class VehicalDecorator implements Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicalDecorator(Vehicle decoratedVehicle){
        this.decoratedVehicle = decoratedVehicle;
    }

    public void draw(){
        decoratedVehicle.draw();
    }
}
