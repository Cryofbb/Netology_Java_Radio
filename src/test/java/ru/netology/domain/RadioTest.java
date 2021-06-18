package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void changeChannelAndNumber() {
        Radio radio = new Radio(50);
        radio.setChannel(1);
        assertEquals(1, radio.getCurrentChannel());
        assertEquals(49, radio.getMaxChannel());
    }

    @Test
    void changeChannelOverMaxAndNumber() {
        Radio radio = new Radio(50);
        radio.setChannel(49);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    void changeChannelLessMinAndNumber() {
        Radio radio = new Radio(50);
        radio.setChannel(0);
        assertEquals(49, radio.decreaseChannel());
    }

    @Test
    void changeChannelAndNotNumber() {
        radio.setChannel(5);
        assertEquals(5, radio.getCurrentChannel());
        assertEquals(10, radio.getMaxChannel());
    }

    @Test
    void changeChannelMoreMax() {
        radio.setChannel(11);
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    void changeChannelLessMin() {
        radio.setChannel(-1);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void increaseChannel() {
        radio.setChannel(8);
        assertEquals(9, radio.increaseChannel());
    }

    @Test
    void increaseChannelOverMax() {
        radio.setChannel(10);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    void decreaseChannel() {
        radio.setChannel(5);
        assertEquals(4, radio.decreaseChannel());
    }

    @Test
    void increaseChannelOverLimit() {
        radio.setChannel(10);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    void decreaseChannelOverLimit() {
        radio.setChannel(0);
        assertEquals(10, radio.decreaseChannel());
    }

    @Test
    void changeVolume() {
        radio.setVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void changeVolumeMoreMax() {
        radio.setVolume(150);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void changeVolumeLessMin() {
        radio.setVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(40);
        assertEquals(41, radio.increaseVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setVolume(40);
        assertEquals(39, radio.decreaseVolume());
    }

    @Test
    void increaseVolumeOverLimit() {
        radio.setVolume(110);
        assertEquals(100, radio.increaseVolume());
    }

    @Test
    void decreaseVolumeOverLimit() {
        radio.setVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }
}
