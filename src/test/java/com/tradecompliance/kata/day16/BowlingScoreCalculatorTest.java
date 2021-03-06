package com.tradecompliance.kata.day16;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class BowlingScoreCalculatorTest {

    private BowlingScoreCalculator classUnderTest;

    @Before
    public void init() {
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
        int actual = classUnderTest.calcualteBonus(givenFrame);
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
        int actual = classUnderTest.calcualteBonus(givenFrame);
        assertEquals(expectedBonus, actual);
    }

    @Test
    public void givenValidSetOfFrames_CalculateScore_ReturnScore() {
        List<Frame> givenFrames = setUpFrames();
        int expectedScore = 73;
        int actual = classUnderTest.calculateScore(givenFrames);
        assertEquals(expectedScore, actual);
    }

    private List<Frame> setUpFrames() {
        List<Frame> frames = new ArrayList<>();
        Frame frame1 = new Frame();
        frame1.setTryOne(6);
        frame1.setTryTwo(3);
        frames.add(frame1);
        Frame frame2 = new Frame();
        frame2.setTryOne(6);
        frame2.setTryTwo(2);
        frames.add(frame2);
        Frame frame3 = new Frame();
        frame3.setTryOne(9);
        frame3.setTryTwo(0);
        frames.add(frame3);
        Frame frame4 = new Frame();
        frame4.setTryOne(7);
        frame4.setTryTwo(2);
        frames.add(frame4);
        Frame frame5 = new Frame();
        frame5.setTryOne(0);
        frame5.setTryTwo(0);
        frames.add(frame5);
        Frame frame6 = new Frame();
        frame6.setTryOne(0);
        frame6.setTryTwo(6);
        frames.add(frame6);
        Frame frame7 = new Frame();
        frame7.setTryOne(5);
        frame7.setTryTwo(4);
        frames.add(frame7);
        Frame frame8 = new Frame();
        frame8.setTryOne(2);
        frame8.setTryTwo(5);
        frames.add(frame8);
        Frame frame9 = new Frame();
        frame9.setTryOne(8);
        frame9.setTryTwo(1);
        frames.add(frame9);
        Frame frame10 = new Frame();
        frame10.setTryOne(5);
        frame10.setTryTwo(2);
        frames.add(frame10);
        return frames;
    }


}