package com.tradecompliance.kata.day20;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrameTest {

    Frame classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new Frame();
    }

    @Test
    public void givenFirstTryIsTen_SetStateAsStrike() {
        classUnderTest.setTryOne(10);
        assertEquals(classUnderTest.getState(), State.STRIKE);
    }

    @Test
    public void givenSumOfFirstAndSecondTryIsTen_SetStateAsSpare(){
        classUnderTest.setTryOne(4);
        classUnderTest.setTryTwo(6);
        assertEquals(classUnderTest.getState(), State.SPARE);
    }

    @Test
    public void givenFirstTryIsTen_DoNotSetTryTwoValue() {
        classUnderTest.setTryOne(10);
        classUnderTest.setTryTwo(5);
        assertEquals(classUnderTest.getTryTwo(), 0);
    }

    @Test
    public void givenAFrameWhicjIsNotLast_TryThreeShouldAlwaysBeZero() {
        classUnderTest.setTryThree(5);
        assertEquals(classUnderTest.getTryThree(), 0);
    }
}