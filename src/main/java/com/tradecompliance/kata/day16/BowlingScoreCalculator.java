package com.tradecompliance.kata.day16;

import java.util.List;

public class BowlingScoreCalculator {

    public int calculateScore(List<Frame> frames) {
        int score = 0;

        for (int i=0;i<10;i++) {
            score += frames.get(i).getTryOne() + frames.get(i).getTryTwo();
            if(i!=9) {
                frames.get(i).setNextFrame(frames.get(i + 1));
            }
            score += calcualteBonus(frames.get(i));
        }

        return score;
    }

    public int calcualteBonus(Frame currentFrame) {
        int bonus = 0;
        if(currentFrame.state.equals(State.STRIKE)) {
            bonus = currentFrame.nextFrame.getTryOne() + currentFrame.nextFrame.tryTwo;
        } else if (currentFrame.state.equals(State.SPARE)) {
            bonus = currentFrame.nextFrame.getTryOne();
        }
        return bonus;
    }

}
