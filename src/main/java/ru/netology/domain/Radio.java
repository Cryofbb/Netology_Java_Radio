package ru.netology.domain;

public class Radio {
    private String name;
    private int maxChannel;
    private int minChannel;
    private int currentChannel;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public String getName() {
        return name;
    } // Получение имени

    public int getMaxChannel() {
        return maxChannel;
    } // Получение максимального канала

    public int getMinChannel() {
        return minChannel;
    } // Получение минимального канала

    public int getMaxVolume() {
        return maxVolume;
    } // Получение максимальной громкости

    public int getMinVolume() {
        return minVolume;
    } // Получение минимальной громкости

    public void setName(String name) {
        this.name = name;
    } // Изменение имени

    public int getStation() {
        return currentChannel;
    } // Текущий канал

    public void setStation(short currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }// Произвольное изменение текущего канала. Если больше min/max то нет изменений

    public int getVolume() {
        return currentVolume;
    } // Текущая громкость

    public void setVolume(short currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }// Произвольное изменение громкости. Если больше min/max то нет изменений

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
        this.currentChannel = currentChannel;
    } // Увеличение номера канала

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        }
        this.currentChannel = currentChannel;
    } // Уменьшение номера канала

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    } // Увеличение громкости

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    } // Уменьшение громкости

    public boolean isOn() {
        return on;
    } // Текущее состояние питания

    public void setOn(boolean on) {
        this.on = on;
    } // Включение питания
}
