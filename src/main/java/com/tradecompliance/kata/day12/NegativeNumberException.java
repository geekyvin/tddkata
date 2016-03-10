package com.tradecompliance.kata.day12;

public class NegativeNumberException extends IllegalArgumentException {
    static final long serialVersionUID = -2848938806368998894L;

    public NegativeNumberException () {
        super();
    }

    public NegativeNumberException (String s) {
        super (s);
    }

    static NegativeNumberException forInputString(String s) {
        return new NegativeNumberException("For input string: \"" + s + "\"");
    }
}
