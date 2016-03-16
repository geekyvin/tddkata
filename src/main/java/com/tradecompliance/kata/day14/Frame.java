package com.tradecompliance.kata.day14;

public class Frame {

        Frame nextFrame;

        int tryOne = 0;
        int tryTwo = 0;

        int bonus = 0;

        public Frame getNextFrame() {
                return nextFrame;
        }

        public void setNextFrame(Frame nextFrame) {
                this.nextFrame = nextFrame;
        }

        public int getTryOne() {
                return tryOne;
        }

        public void setTryOne(int tryOne) {
                this.tryOne = tryOne;
        }

        public int getTryTwo() {
                return tryTwo;
        }

        public void setTryTwo(int tryTwo) {
                this.tryTwo = tryTwo;
        }

        public int getBonus() {
                return bonus;
        }

        public void setBonus(int bonus) {
                this.bonus = bonus;
        }
}
