package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldUseNoArguments() {
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void shouldUseAllArguments() {
        Radio radio = new Radio(1, 100, 0, 50, 100, 0, 50);
        assertEquals(50, radio.getVolume());
        assertEquals(99, radio.getMaxChannel());
    }

    @Test
    public void createNewStationList() {
        Radio radio = new Radio(10, 21);
        assertEquals(30, radio.getMaxChannel());
        assertEquals(10, radio.getChannelNumber());
    }

    @Test
    public void shouldChangeCurrentChannelMoreMax() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getChannel());
    }

    @Test
    public void shouldChangeCurrentChannelLessMin() {
        Radio radio = new Radio(-1);
        assertEquals(0, radio.getChannel());
    }

    @Test
    public void shouldChangeCurrentChannel() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOverMax() {
        Radio radio = new Radio(50);
        assertEquals(10, radio.getChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOverMin() {
        Radio radio = new Radio(-1);
        assertEquals(0, radio.getChannel());
    }

    @Test
    public void shouldIncreaseChannel() {
        Radio radio = new Radio(5);
        assertEquals(6, radio.increaseChannel());
    }

    @Test
    public void shouldIncreaseChannelMoreMax() {
        Radio radio = new Radio(10);
        assertEquals(0, radio.increaseChannel());
    }

    @Test
    public void shouldDecreaseChannel() {
        Radio radio = new Radio(5);
        assertEquals(4, radio.decreaseChannel());
    }

    @Test
    public void shouldDecreaseChannelLessMin() {
        Radio radio = new Radio(0);
        assertEquals(10, radio.decreaseChannel());
    }

    @Test
    public void shouldSetChannelNumber() {
        Radio radio = new Radio();
        radio.setChannelNumber(10);
        assertEquals(10, radio.getChannelNumber());
    }

    @Test
    void changeVolume() {
        radio.setVolume(20);
        assertEquals(20, radio.getVolume());
    }

    @Test
    void changeVolumeMoreMax() {
        radio.setVolume(150);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void changeVolumeLessMin() {
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(4);
        assertEquals(5, radio.increaseVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setVolume(4);
        assertEquals(3, radio.decreaseVolume());
    }

    @Test
    void increaseVolumeOverLimit() {
        radio.setVolume(101);
        assertEquals(100, radio.increaseVolume());
    }

    @Test
    void decreaseVolumeOverLimit() {
        radio.setVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }
}
//    @Test
//    void changeChannel() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(1);
//        assertEquals(1, radio.getChannel());
//    }
//    @Test
//    void changeChannelMoreMax() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(11);
//        assertEquals(9, radio.getChannel());
//    }
//    @Test
//    void changeChannelLessMin() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(1);
//        radio.setChannel(0);
//        assertEquals(1, radio.getChannel());
//    }
//    @Test
//    void increaseChannel() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(8);
//        assertEquals(9, radio.increaseChannel());
//    }
//
//    @Test
//    void increaseChannelOverMax() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(9);
//        assertEquals(0, radio.increaseChannel());
//    }
//
//    @Test
//    void decreaseChannel() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(1);
//        assertEquals(0, radio.decreaseChannel());
//    }
//
//    @Test
//    void decreaseChannelLessMin() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(0);
//        assertEquals(9, radio.decreaseChannel());
//    }
//
//    @Test
//    void increaseChannelOverLimit() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(9);
//        assertEquals(0, radio.increaseChannel());
//    }
//
//    @Test
//    void decreaseChannelOverLimit() {
//        radio.setMaxChannel(9);
//        radio.setMinChannel(0);
//        radio.setChannel(0);
//        assertEquals(9, radio.decreaseChannel());
//    }
