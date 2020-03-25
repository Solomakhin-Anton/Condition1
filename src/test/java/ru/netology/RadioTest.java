package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(12);
    @Test
    void increaseCurrentStation() {

        radio.setCurrentStation(12);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStationPositive() {

        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {

        radio.setCurrentVolume(0);
        radio.decreaseCurrentStation();
        assertEquals(12, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationPositive() {

        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {

        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumePositive() {

        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumePositive() {

        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void manualInstallation() {

        radio.setCurrentStation(6);
        radio.manualInstallation();
        assertEquals(6, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }

    @Test
    void manualInstallationNegative() {

        radio.setCurrentStation(15);
        radio.manualInstallation();
        assertEquals(12, radio.getCurrentStation());
        System.out.println("Current Station:" + radio.getCurrentStation());
    }
}