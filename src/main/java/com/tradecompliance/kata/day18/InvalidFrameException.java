package com.tradecompliance.kata.day18;

public class InvalidFrameException extends IllegalArgumentException {
    static final long serialVersionUID = -2848938806368998894L;

    public InvalidFrameException() {
        super();
    }

    public InvalidFrameException(String s) {
        super (s);
    }

    static InvalidFrameException forInputString(String s) {
        return new InvalidFrameException("For input string: \"" + s + "\"");
    }
}
