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

        currentStation += 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
            return;
        }

        currentStation = currentStation;

    }

    public void decreaseCurrentStation() {

        currentStation -= 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
            return;
        }

        currentStation = currentStation;

    }

    public void increaseCurrentVolume() {

        currentVolume += 1;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        currentVolume = currentVolume;

    }

    public void decreaseCurrentVolume() {

        currentVolume -= 1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }

        currentVolume = currentVolume;

    }


}
