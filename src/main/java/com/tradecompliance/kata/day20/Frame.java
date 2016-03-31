package com.tradecompliance.kata.day20;

public class Frame {

    private int tryOne = 0 ;
    private int tryTwo = 0;

    private int tryThree = 0;

    private boolean isLast = false;

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
        }

        if(tryOne == 0 && tryTwo == 0) {
            state = State.NOPINS;
        }
    }

    public int getTryThree() {
        return tryThree;
    }

    public void setTryThree(int tryThree) {
        if(isLast) {
            this.tryThree = tryThree;
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


    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }
}

enum State {
    STRIKE,
    SPARE,
    NOPINS,
    FOUL,
    VALID;
}


