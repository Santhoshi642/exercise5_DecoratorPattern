package com.example.exercise4_DecoratorPattern;
public class RedCar extends VehicalDecorator {
    public RedCar  (Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void draw() {
        decoratedVehicle.draw();
        setRed(decoratedVehicle);
    }

    private void setRed(Vehicle decoratedVehicle){
        System.out.println("Color: Red");
    }
}
