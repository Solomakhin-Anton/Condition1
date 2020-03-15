package ru.netology;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentStation() {

        int station = currentStation + 1;
        if (station > maxStation) {
            currentStation = minStation;
            return;
        }

        this.currentStation = station;

    }

    public void decreaseCurrentStation() {

        int station = currentStation - 1;
        if (station < minStation) {
            currentStation = maxStation;
            return;
        }

        this.currentStation = station;

    }

    public void increaseCurrentVolume() {

        int volume = currentVolume + 1;
        if (volume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        this.currentVolume = volume;

    }

    public void decreaseCurrentVolume() {

        int volume = currentVolume - 1;
        if (volume < minVolume) {
            currentVolume = minVolume;
            return;
        }

        this.currentVolume = volume;

    }


}
