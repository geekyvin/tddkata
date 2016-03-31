package com.tradecompliance.kata.day21;

public class Frame {

    private int tryOne = 0;

    private int tryTwo = 0;

    private Frame nextFrame;

    private int bonus;

    private State state = State.VALID;

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
        if(tryOne < 10) {
            this.tryTwo = tryTwo;
        }
        if(tryOne+tryTwo == 10) {
            state = State.SPARE;
        } else if(tryOne == 0 && tryTwo == 0) {
            state = State.NOPINS;
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
    VALID;
}


