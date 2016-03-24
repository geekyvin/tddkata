package com.tradecompliance.kata.day19;

import java.util.List;

public class BowlingScoreCalculator {

    public int calculateScore(List<Frame> frames) {
        int score = 0;

        for(Frame frame:frames) {
            score += frame.getTryOne() + frame.getTryTwo();
            score += calculateBonus(frame);
        }

        return score;
    }

    public int calculateBonus(Frame currentFrame) {
        int bonus = 0;
        if (currentFrame.isLast()) {
            bonus = currentFrame.getTryThree();
            return bonus;
        } else if (currentFrame.getState() == State.STRIKE) {
            bonus = currentFrame.getNextFrame().getTryOne() + currentFrame.getNextFrame().getTryTwo();
        } else if (currentFrame.getState() == State.SPARE) {
            bonus = currentFrame.getNextFrame().getTryOne();
        }
        return bonus;
    }

}
