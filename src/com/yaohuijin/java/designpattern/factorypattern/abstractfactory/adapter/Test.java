package com.yaohuijin.java.designpattern.factorypattern.abstractfactory.adapter;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("歌唱祖国.mp3");
        MediaAdapter wma = new MediaAdapter("wma");
        wma.play("好日子.wma");
        MediaAdapter mp4 = new MediaAdapter("mp4");
        mp4.play("幸福万年长.mp4");
    }
}
