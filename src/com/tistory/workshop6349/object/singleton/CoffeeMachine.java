package com.tistory.workshop6349.object.singleton;

public class CoffeeMachine {

    public static final CoffeeMachine INSTANCE = new CoffeeMachine();

    private CoffeeMachine() {

    }

    public void returnCoffee() {
        System.out.println("커피를 반환했습니다.");
    }

}
