package com.tistory.workshop6349.object.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Company {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> aClass = CoffeeMachine.class;
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        CoffeeMachine coffeeMachine = (CoffeeMachine) constructor.newInstance();
        coffeeMachine.returnCoffee();
    }
}
