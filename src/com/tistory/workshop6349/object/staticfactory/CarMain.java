package com.tistory.workshop6349.object.staticfactory;

public class CarMain {

    public static void main(String[] args) {
        Car car = Car.brandOf("현대");
        System.out.println(car.getBrand());
    }

}
