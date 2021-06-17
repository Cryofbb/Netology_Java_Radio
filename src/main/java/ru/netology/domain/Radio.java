package ru.netology.domain;

public class Radio {
    private int id;
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

    public Radio(int id, int maxChannel, int minChannel, int currentChannel, int maxVolume, int minVolume, int currentVolume) {
        this.id = id;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentChannel = currentChannel;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getChannel() {
        return currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
