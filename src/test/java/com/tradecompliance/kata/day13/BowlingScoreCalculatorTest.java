package com.tradecompliance.kata.day13;

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
    public void GivenAInvalidFrame_CalculateScore_ThrowInvalidFrameException() {

        LinkedList<Frame> givenFrames = new LinkedList<>();

        for(int i=0;i<11;i++) {
            givenFrames.add(new Frame());
        }

        int actual = classUnderTest.calculateScore(givenFrames);

    }


}