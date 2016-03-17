package com.tradecompliance.kata.day15;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class BowlingScoreCalculatorTest {

    BowlingScoreCalculator classUnderTest;

    @Before
    public void init() {
        classUnderTest = new BowlingScoreCalculator();
    }

    @Test(expected = InvalidFrameException.class)
    public void givenAFramesListOfMoreThanTen_CalculateScore_ThrowInvalidFrameException() {

        LinkedList<Frame> givenFrames = new LinkedList<>();

        for(int i=0;i<11;i++) {
            givenFrames.add(new Frame());
        }
        classUnderTest.calculateScore(givenFrames);
    }

    @Test(expected = InvalidFrameException.class)
    public void givenAFramesListOfLessThanTen_CalculateScore_ThrowInvalidFrameException() {
        LinkedList<Frame> givenFrames = new LinkedList<>();

        for(int i=0;i<5;i++) {
            givenFrames.add(new Frame());
        }
        classUnderTest.calculateScore(givenFrames);
    }

    @Test
    public void givenAFrameWithStateStrike_calculateFrameBonus_ReturnBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(10);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(6);
        givenFrame.setNextFrame(nextFrame);
        int actual = classUnderTest.calculateFrameBonus(givenFrame);

    }

}