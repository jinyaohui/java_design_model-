package com.yaohuijin.java.designpattern.factorypattern.abstractfactory.adapter;

public class WmaPlayer implements AdvanceMediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("play wma filename:" + filename);
    }
}
