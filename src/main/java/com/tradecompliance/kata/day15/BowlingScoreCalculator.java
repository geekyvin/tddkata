package com.tradecompliance.kata.day15;

import java.util.LinkedList;
import java.util.List;

public class BowlingScoreCalculator {

    public int calculateScore(LinkedList<Frame> frames) {

        int score = 0;

        if(checkFrameLength(frames)) {

        }

        return score;

    }

    boolean checkFrameLength(List<Frame> frames) {
        if(frames.size() == 10) {
            return true;
        } else {
            throw new InvalidFrameException("The length of the frame given is "
                    +frames.size()
                    +" it should be Ten!");
        }
    }

    public int calculateFrameBonus(Frame currentFrame) {
        if(currentFrame.state.equals(State.STRIKE)) {
            return currentFrame.getNextFrame().getTryOne()
                    +currentFrame.getNextFrame().getTryTwo();
        } else if(currentFrame.state.equals(State.SPARE)) {
            return currentFrame.getNextFrame().getTryOne();
        }
        return 0;
    }
}
