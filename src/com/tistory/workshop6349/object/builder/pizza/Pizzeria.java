package com.tistory.workshop6349.object.builder.pizza;

public class Pizzeria {

    public static void main(String[] args) {
        BusanPizza busanPizza = new BusanPizza.Builder(BusanPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.PEPPER)
                .addTopping(Pizza.Topping.MUSHROOM)
                .build();
        SeoulPizza seoulPizza = new SeoulPizza.Builder()
                .addTopping(Pizza.Topping.SAUSAGE)
                .addSausageInside()
                .build();
    }

}
