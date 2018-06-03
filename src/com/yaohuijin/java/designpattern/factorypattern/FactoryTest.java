package com.yaohuijin.java.designpattern.factorypattern;

public class FactoryTest {

    public static void main(String[] args) {
        // 普通工厂模式
        NormalHumanFactory normal = new NormalHumanFactory();
        Human man = normal.createHuamn("man");
        man.eat();
        man.sleep();
        man.beat();

        // 多个工厂方法模式
        MilMethodHumanFactory mil = new MilMethodHumanFactory();
        Human man1 = mil.createMan();
        man1.eat();
        man1.sleep();
        man1.beat();

        //静态工厂方法模式
        Human man2 = StaticHumanFactory.createMan();
        man2.eat();
        man2.sleep();
        man2.beat();
    }
}
