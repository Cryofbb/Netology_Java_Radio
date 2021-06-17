package ru.netology.domain;

public class Radio {
    private int id;
    private int channelNumber;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int currentChannel = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 50;

    public Radio() {
    }

    public Radio(int currentChannel) {
        if (currentChannel > maxChannel) {
            currentChannel = maxChannel;
        }
        if (currentChannel < minChannel) {
            currentChannel = minChannel;
        }
        this.currentChannel = currentChannel;
    }

    public Radio(int channelNumber, int minChannel) {
        this.channelNumber = channelNumber;
        this.minChannel = minChannel;
        this.maxChannel = minChannel + channelNumber - 1;
    }

    public Radio(int id, int channelNumber, int minChannel, int currentChannel, int maxVolume, int minVolume, int currentVolume) {
        this.id = id;
        this.maxChannel = minChannel + channelNumber - 1;
        this.minChannel = minChannel;
        this.currentChannel = currentChannel;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getChannel() {
        return currentChannel;
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

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
        this.maxChannel = minChannel + channelNumber - 1;
    }

    public int getVolume() {
        return currentVolume;
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
//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }
//
//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }