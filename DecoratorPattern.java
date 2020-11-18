package com.example.exercise4_DecoratorPattern;
public class DecoratorPattern {
    public static void main(String[] args) {

        Vehicle c = new Bus();

        Vehicle rc = new RedCar(new Car());

        Vehicle rb = new RedCar( new Bus());
        System.out.println("Car is of white border");
        c.draw();

        System.out.println("\nCar is  of red border");
        rb.draw();

        System.out.println("\nBus is of red border");
        rc.draw();
    }
}
