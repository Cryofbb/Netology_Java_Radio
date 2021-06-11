package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void changeChannel() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(1);
        assertEquals(1, radio.getChannel());
    } // Изменение канала в пределах min-max

    @Test
    void changeChannelMoreMax() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(11);
        assertEquals(9, radio.getChannel());
    } // Изменение канала больше max

    @Test
    void changeChannelLessMin() {
        radio.setMaxChannel(9);
        radio.setMinChannel(1);
        radio.setChannel(0);
        assertEquals(1, radio.getChannel());
    }// Изменение канала меньше min

    @Test
    void increaseChannel() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(4);
        assertEquals(5, radio.increaseChannel());
    }// Увеличение канала на 1 пункт

    @Test
    void decreaseChannel() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(4);
        assertEquals(3, radio.decreaseChannel());
    }// Уменьшение канала на 1 пункт

    @Test
    void increaseChannelOverLimit() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(9);
        assertEquals(0, radio.increaseChannel());
    }// Увеличение канала выше max

    @Test
    void decreaseChannelOverLimit() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(0);
        assertEquals(9, radio.decreaseChannel());
    }// Уменьшение канала ниже min

    @Test
    void changeVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(1);
        assertEquals(1, radio.getVolume());
    }// Изменение громкости в пределах min-max

    @Test
    void changeVolumeMoreMax() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(15);
        assertEquals(10, radio.getVolume());
    }// Изменение громкости больше Max

    @Test
    void changeVolumeLessMin() {
        radio.setMaxVolume(10);
        radio.setMinVolume(5);
        radio.setVolume(1);
        assertEquals(5, radio.getVolume());
    }// Изменение громкости меньше min

    @Test
    void increaseVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(4);
        assertEquals(5, radio.increaseVolume());
    }// Увеличение громкости на 1 пункт

    @Test
    void decreaseVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(4);
        assertEquals(3, radio.decreaseVolume());
    }// Уменьшение громкости на 1 пункт

    @Test
    void increaseVolumeOverLimit() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(10, radio.increaseVolume());
    }// Увеличение громкости выше max

    @Test
    void decreaseVolumeOverLimit() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }// Уменьшение громкости ниже min
}
