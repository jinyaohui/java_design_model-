package com.yaohuijin.java.designpattern.factorypattern.abstractfactory;

public class Test {
    public static void eat(KitchenFactory kitchenFactory) {
        System.out.println(kitchenFactory.getFood().getFoodName() + kitchenFactory.getTableWare().getTableWareName());

    }

    public static void main(String[] args) {
        AKitchen aKitchen = new AKitchen();
        eat(aKitchen);
    }
}
