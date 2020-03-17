package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStationPositive() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationPositive() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumePositive() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumePositive() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

}