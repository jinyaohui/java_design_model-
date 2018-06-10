package com.yaohuijin.java.designpattern.factorypattern.abstractfactory.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("play Mp3 filename:" + filename);
    }
}
