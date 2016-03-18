package com.tradecompliance.kata.day16;

/**
 *      X = Strike
 *      / = Spare
 *      - = No pins knocked down
 *      F = Foul
 *      Circled Number = a split with that number of pins knocked down.
 **/

public class Frame {

    int tryOne = 0 ;
    int tryTwo = 0;

    Frame nextFrame;

    int bonus;

    State state = State.VALID;

    public int getTryOne() {
        return tryOne;
    }

    public void setTryOne(int tryOne) {
        this.tryOne = tryOne;
        if(tryOne == 10) {
            state = State.STRIKE;
        }
    }

    public int getTryTwo() {
        return tryTwo;
    }

    public void setTryTwo(int tryTwo) {
        this.tryTwo = tryTwo;
        if(tryOne+tryTwo == 10) {
            state = State.SPARE;
        }
    }

    public Frame getNextFrame() {
        return nextFrame;
    }

    public void setNextFrame(Frame nextFrame) {
        this.nextFrame = nextFrame;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

enum State {
    STRIKE,
    SPARE,
    NOPINS,
    FOUL,
    VALID;
}


