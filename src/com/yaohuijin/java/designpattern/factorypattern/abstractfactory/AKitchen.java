package com.yaohuijin.java.designpattern.factorypattern.abstractfactory;

public class AKitchen implements KitchenFactory {

    @Override
    public Food getFood() {
        return new Apple();
    }

    @Override
    public TableWare getTableWare() {
        return new Chopsticks();
    }
}
