package com.tistory.workshop6349.object.instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = UtilityClass.class;
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        UtilityClass utilityClass = (UtilityClass) constructor.newInstance();
    }

}
