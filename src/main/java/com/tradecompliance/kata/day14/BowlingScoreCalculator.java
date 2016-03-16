package com.tradecompliance.kata.day14;

import java.util.LinkedList;
import java.util.List;

public class BowlingScoreCalculator {

    /**
     *      X = Strike
     *      / = Spare
     *      - = No pins knocked down
     *      F = Foul
     *      Circled Number = a split with that number of pins knocked down.
     **/

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

    public void calculateFrameBonus(Frame currentFrame, int position) {

    }

}
