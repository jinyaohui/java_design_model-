package com.yaohuijin.java.designpattern.factorypattern.abstractfactory.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type) {
        switch (type) {
            case "mp4":
                advanceMediaPlayer = new Mp4Player();
                break;
            case "wma":
                advanceMediaPlayer = new WmaPlayer();
                break;
        }
    }

    @Override
    public void play(String filename) {
        advanceMediaPlayer.play(filename);
    }
}
