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
    }

    @Test
    void changeChannelMoreMax() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(11);
        assertEquals(9, radio.getChannel());
    }

    @Test
    void changeChannelLessMin() {
        radio.setMaxChannel(9);
        radio.setMinChannel(1);
        radio.setChannel(0);
        assertEquals(1, radio.getChannel());
    }

    @Test
    void increaseChannel() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(8);
        assertEquals(9, radio.increaseChannel());
    }

    @Test
    void increaseChannelOverMax() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(9);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    void decreaseChannel() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(1);
        assertEquals(0, radio.decreaseChannel());
    }

    @Test
    void decreaseChannelLessMin() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(0);
        assertEquals(9, radio.decreaseChannel());
    }

    @Test
    void increaseChannelOverLimit() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(9);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    void decreaseChannelOverLimit() {
        radio.setMaxChannel(9);
        radio.setMinChannel(0);
        radio.setChannel(0);
        assertEquals(9, radio.decreaseChannel());
    }

    @Test
    void changeVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(1);
        assertEquals(1, radio.getVolume());
    }

    @Test
    void changeVolumeMoreMax() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(15);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void changeVolumeLessMin() {
        radio.setMaxVolume(10);
        radio.setMinVolume(5);
        radio.setVolume(1);
        assertEquals(5, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(4);
        assertEquals(5, radio.increaseVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(4);
        assertEquals(3, radio.decreaseVolume());
    }

    @Test
    void increaseVolumeOverLimit() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(10, radio.increaseVolume());
    }

    @Test
    void decreaseVolumeOverLimit() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }
}
