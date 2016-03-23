package com.tradecompliance.kata.day18;

import java.util.List;

public class BowlingScoreCalculator {

    public int calculateScore(List<Frame> frames) {
        int score = 0;

        for (int i = 0; i < 10; i++) {
            score += frames.get(i).getTryOne() + frames.get(i).getTryTwo();
            if (i != 9) {
                frames.get(i).setNextFrame(frames.get(i + 1));
            } else if (i == 9) {
                frames.get(i).setLast(true);
            }
            score += calculateBonus(frames.get(i));
        }

        return score;
    }

    public int calculateBonus(Frame currentFrame) {

        int bonus = 0;
        if (!currentFrame.isLast() && currentFrame.getState().equals(State.STRIKE)) {
            bonus = currentFrame.getNextFrame().getTryOne() + currentFrame.getNextFrame().getTryTwo();
        } else if (!currentFrame.isLast() && currentFrame.getState().equals(State.SPARE)) {
            bonus = currentFrame.getNextFrame().getTryOne();
        }

        if (currentFrame.isLast()) {
            bonus = currentFrame.getTryThree();
        }

        return bonus;
    }
}