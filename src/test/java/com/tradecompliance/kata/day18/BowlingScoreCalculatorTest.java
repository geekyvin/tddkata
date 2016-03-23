package com.tradecompliance.kata.day18;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BowlingScoreCalculatorTest {

    BowlingScoreCalculator classUnderTest;

    List<Frame> givenFrames;

    int expectedScore;

    public BowlingScoreCalculatorTest(List<Frame> frames, int score) {
        givenFrames = frames;
        expectedScore = score;
    }

    @Before
    public void setUp() throws Exception {
        classUnderTest = new BowlingScoreCalculator();
    }

    @Test
    public void givenValidFrameWhichIsAStrike_CalculateBonus_ReturnBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(10);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(6);
        givenFrame.setNextFrame(nextFrame);
        int expectedBonus = 10;
        int actual = classUnderTest.calculateBonus(givenFrame);
        assertEquals(expectedBonus, actual);
    }

    @Test
    public void givenValidFrameWhichIsASpare_CalculateBonus_ReturnBonus() {
        Frame givenFrame = new Frame();
        givenFrame.setTryOne(8);
        givenFrame.setTryTwo(2);
        Frame nextFrame = new Frame();
        nextFrame.setTryOne(4);
        nextFrame.setTryTwo(6);
        givenFrame.setNextFrame(nextFrame);
        int expectedBonus = 4;
        int actual = classUnderTest.calculateBonus(givenFrame);
        assertEquals(expectedBonus, actual);
    }

    @Test
    public void givenValidSetOfFrames_CalculateScore_ReturnScore() {
        int actual = classUnderTest.calculateScore(givenFrames);
        assertEquals(expectedScore, actual);
    }

    @Parameterized.Parameters
    public static List<Object[]> getFramesAndScore() {
        return Arrays.asList(new Object[][]{
                {setUpFrames(new int[][]{{6,3}, {6,2}, {9, 0}, {7, 2}, {0, 0}, {0, 6}, {5, 4}, {2, 5}, {8, 1}, {5, 2}}), 128}
        });
    }

    public static List<Frame> setUpFrames(int[][] frames) {
        List<Frame> frameList =new ArrayList<>();
        for(int i=0; i<10; i++) {
            Frame frame = new Frame();
            frame.setTryOne(frames[i][0]);
            frame.setTryTwo(frames[i][1]);
            if(i==9 && ((frame.getState() == State.STRIKE)
                    || (frame.getState() == State.SPARE))) {
                frame.setLast(true);
                frame.setTryThree(frames[i][2]);
            }
            frameList.add(frame);
        }
        return frameList;
    }
}
