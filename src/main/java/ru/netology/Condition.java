package ru.netology;

public class Condition {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 12;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {

        if (currentTemperature >= maxTemperature) {
            currentTemperature = maxTemperature;
            return;
        }
        currentTemperature += 1;

    }


    public void decreaseCurrentTemperature() {

        if (currentTemperature <= minTemperature) {
            currentTemperature = minTemperature;
            return;
        }

        currentTemperature -= 1;
    }

}