package com.study._20_Access.speaker;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        if (volume > 100) {
            volume = 100;
        } else if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
    }

    public void volumeUp() {
        volume += 10;
        if (volume > 100) {
            volume = 100;
        }
        showVolume();
    }

    public void volumeDown() {
        volume -= 10;
        if (volume < 0) {
            volume = 0;
        }
        showVolume();
    }

    public void showVolume() {
        System.out.println("현재볼륨: " + volume);
    }
}
