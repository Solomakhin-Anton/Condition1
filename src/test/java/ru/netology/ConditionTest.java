package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(30);
        condition.increaseCurrentTemperature();
        assertEquals(30, condition.getCurrentTemperature());

    }

    @Test
    void increaseCurrentTemperaturePositive() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(6);
        condition.increaseCurrentTemperature();
        assertEquals(7, condition.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(12);
        condition.decreaseCurrentTemperature();
        assertEquals(12 , condition.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperaturePositive() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(19);
        condition.decreaseCurrentTemperature();
        assertEquals(18 , condition.getCurrentTemperature());
    }

}
