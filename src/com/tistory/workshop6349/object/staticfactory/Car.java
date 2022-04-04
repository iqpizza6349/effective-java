package com.tistory.workshop6349.object.staticfactory;

public class Car {

    private final String brand;

    private Car(String brand) {
        this.brand = brand;
    }

    public static Car brandOf(String brand) {
        return new Car(brand);
    }

    public String getBrand() {
        return brand;
    }
}
