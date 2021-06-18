package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Radio {
    private final int minChannel = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int maxChannel = 10;
    private int currentChannel = 5;
    private int currentVolume = 50;
    private int channelNumber = 11;

    public Radio(int channelNumber) {
        this.channelNumber = channelNumber;
        this.maxChannel = minChannel + channelNumber - 1;
    }

    public void setChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            currentChannel = maxChannel;
        }
        if (currentChannel < minChannel) {
            currentChannel = minChannel;
        }
        this.currentChannel = currentChannel;
    }

    public int increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = minChannel;
        }
        return currentChannel;
    }

    public int decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = maxChannel;
        }
        return currentChannel;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            return currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            return currentVolume;
        }
        return currentVolume;
    }
}
