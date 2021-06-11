package ru.netology.domain;

public class Radio {
    private int maxChannel;
    private int minChannel;
    private int currentChannel;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getChannel() {
        return currentChannel;
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
        if(currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
        return currentChannel;
    }

    public int decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        } else if (currentChannel == minChannel) {
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
