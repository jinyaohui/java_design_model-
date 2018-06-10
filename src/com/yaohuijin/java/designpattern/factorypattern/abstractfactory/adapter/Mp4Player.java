package com.yaohuijin.java.designpattern.factorypattern.abstractfactory.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("play Mp4 filename:" + filename);
    }
}
