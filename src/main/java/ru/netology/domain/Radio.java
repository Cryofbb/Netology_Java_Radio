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
    } // Изменение max канала

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    } // Изменение min канала

    public int getChannel() {
        return currentChannel;
    } // Текущий канал

    public void setChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            currentChannel = maxChannel;
            }
        if (currentChannel < minChannel) {
            currentChannel = minChannel;
        }
        this.currentChannel = currentChannel;
    }// Произвольное изменение текущего канала. Если больше min/max то нет изменений

    public int increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
        return currentChannel;
    } // Увеличение номера канала

    public int decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        }
        return currentChannel;
    } // Уменьшение номера канала

    // Громкость

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    } // Изменение max громкости

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    } // Изменение min громкости

    public int getVolume() {
        return currentVolume;
    } // Текущая громкость

    public void setVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }// Произвольное изменение громкости. Если больше min/max то нет изменений

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            return currentVolume;
        }
        return currentVolume;
    } // Увеличение громкости

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            return currentVolume;
        }
        return currentVolume;
    } // Уменьшение громкости
}
