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

        condition.setCurrentTemperature(5);
        //long temp = condition.getCurrentTemperature() + 1;
        assertEquals(2, condition.getCurrentTemperature());

    }




}
