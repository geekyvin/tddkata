package com.tradecompliance.kata.day19;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BowlingScoreCalculatorTest {

    private BowlingScoreCalculator classUnderTest;

    @Before
    public void init() {
        classUnderTest = new BowlingScoreCalculator();
    }

    @Test
    public void givenCurrentFrame_WhenFrameIsStrike_ReturnValidBonus() {
        Frame givenCurrentFrame = new Frame();
        Frame givenNextFrame = new Frame();
        givenCurrentFrame.setTryOne(10);
        givenNextFrame.setTryOne(4);
        givenNextFrame.setTryTwo(4);
        givenCurrentFrame.setNextFrame(givenNextFrame);
        int expected = 8;
        int actual = classUnderTest.calculateBonus(givenCurrentFrame);
        assertEquals(actual, expected);
    }

    @Test
    public void givenCurrentFrame_WhenFrameIsSpare_ReturnValidBonus() {
        Frame givenCurrentFrame = new Frame();
        Frame givenNextFrame = new Frame();
        givenCurrentFrame.setTryOne(8);
        givenCurrentFrame.setTryTwo(2);
        givenNextFrame.setTryOne(4);
        givenNextFrame.setTryTwo(4);
        givenCurrentFrame.setNextFrame(givenNextFrame);
        int expected = 4;
        int actual = classUnderTest.calculateBonus(givenCurrentFrame);
        assertEquals(actual, expected);
    }

    @Test
    public void givenCurrentFrame_WhenFrameIsOnlyValid_ReturnValidBonus() {
        Frame givenCurrentFrame = new Frame();
        Frame givenNextFrame = new Frame();
        givenCurrentFrame.setTryOne(6);
        givenCurrentFrame.setTryTwo(2);
        givenNextFrame.setTryOne(4);
        givenNextFrame.setTryTwo(4);
        givenCurrentFrame.setNextFrame(givenNextFrame);
        int expected = 0;
        int actual = classUnderTest.calculateBonus(givenCurrentFrame);
        assertEquals(actual, expected);
    }

    @Test
    public void whenFirstBallIsAStrike_SetTheStateOfTheFrameAsStrike() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(10);
        assertEquals(givenFrame.getState(), State.STRIKE);
     }

    @Test
    public void whenTwoTriesEqualsTen_SetTheStateOfTheFrameAsSpare() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(6);
        givenFrame.setTryTwo(4);
        assertEquals(givenFrame.getState(), State.SPARE);
    }

    @Test
    public void whenTwoTriesEqualsLessThanTen_CheckTheStateOfTheFrameIsOnlyValid() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(2);
        givenFrame.setTryTwo(2);
        assertEquals(givenFrame.getState(), State.VALID);
    }

}