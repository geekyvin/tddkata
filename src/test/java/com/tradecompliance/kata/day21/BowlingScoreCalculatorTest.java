package com.tradecompliance.kata.day21;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BowlingScoreCalculatorTest {

    private BowlingScoreCalculator classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new BowlingScoreCalculator();
    }

    @Test
    public void whenGivenFrameIsAStrike_CalculateBonus_ReturnValidBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(10);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(4);
        givenFrame.setNextFrame(nextFrame);
        int expected = 8;
        int actual = classUnderTest.calculateBonus(givenFrame);
        assertEquals(actual, expected);
    }

    @Test
    public void whenGivenFrameIsASpare_CalculateBonus_ReturnValidBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(6);
        givenFrame.setTryTwo(4);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(4);
        givenFrame.setNextFrame(nextFrame);
        int expected = 4;
        int actual = classUnderTest.calculateBonus(givenFrame);
        assertEquals(actual, expected);
    }

    @Test
    public void whenGivenFrameIsAOnlyValid_CalculateBonus_ReturnValidBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(6);
        givenFrame.setTryTwo(3);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(4);
        givenFrame.setNextFrame(nextFrame);
        int expected = 0;
        int actual = classUnderTest.calculateBonus(givenFrame);
        assertEquals(actual, expected);
    }

}