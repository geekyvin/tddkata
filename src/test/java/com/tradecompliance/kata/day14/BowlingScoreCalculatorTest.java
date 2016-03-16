package com.tradecompliance.kata.day14;

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

        int actual = classUnderTest.calculateScore(givenFrames);
    }

    @Test(expected = InvalidFrameException.class)
    public void givenAFramesListOfLessThanTen_CalculateScore_ThrowInvalidFrameException() {

        LinkedList<Frame> givenFrames = new LinkedList<>();

        for(int i=0;i<11;i++) {
            givenFrames.add(new Frame());
        }

        int actual = classUnderTest.calculateScore(givenFrames);
    }

    @Test
    public void givenAFrameThatsIsNotALastFrame_calculateBonus_returnValidBonus() {

    }

    @Test
    public void givenAFrameThatIsALastFrame_calculateBonus_returnValidBonus() {

    }


    public LinkedList<Frame> setUpFrames() {

        LinkedList<Frame> frames = new LinkedList<>();

        Frame frame1 = new Frame();
        frame1.setTryOne(10);

        Frame frame2 = new Frame();
        Frame frame3 = new Frame();
        Frame frame4 = new Frame();
        Frame frame5 = new Frame();
        Frame frame6 = new Frame();
        Frame frame7 = new Frame();
        Frame frame8 = new Frame();
        Frame frame9 = new Frame();
        Frame frame10 = new Frame();

        return frames;

    }

}