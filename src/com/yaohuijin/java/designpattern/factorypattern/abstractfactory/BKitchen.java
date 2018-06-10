package com.yaohuijin.java.designpattern.factorypattern.abstractfactory;

public class BKitchen implements KitchenFactory {
    @Override
    public Food getFood() {
        return new Orange();
    }

    @Override
    public TableWare getTableWare() {
        return new Knife();
    }
}
