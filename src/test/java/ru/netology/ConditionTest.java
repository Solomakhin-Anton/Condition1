package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
  //  @Test
    //public void shouldGetAndSet() {
      //  Condition condition = new Condition();
        //String expected = "Кондишн";

        //assertNull(condition.getName());
        //condition.setName(expected);
        //assertEquals(expected, condition.getName());
    //}

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(6);
        condition.increaseCurrentTemperature();
        assertEquals(7, condition.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(19);
        condition.decreaseCurrentTemperature();
        assertEquals(18 , condition.getCurrentTemperature());
    }


}
