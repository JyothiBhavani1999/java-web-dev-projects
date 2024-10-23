package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 30, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}