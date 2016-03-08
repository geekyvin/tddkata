package com.tradecompliance.kata.day10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAdderTest {

    private StringAdder classUnderTest;

    @Before
    public void init() {
        classUnderTest = new StringAdder();
    }

    @Test
    public void forInputString_InputIsEmpty_ReturnZero() {
        String input = "";
        int expected = 0;
        int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void forInputString_InputIsOne_ReturnOne() {
        String input = "1";
        int expected = 1;
        int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void InputIsOneAndTwo_ChangedDelimitter_ReturnThree() {
        String input = "//;\n1;2";
        int expected = 3;
         int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void givenValidInputWithDelimiter_GetDelimiter_ReturnDelimiterChar() {
        String numbers = "//;\n1;2";
        String expectedDelimiter = ";";
        String actual = classUnderTest.getDelimiter(numbers);
        assertEquals(actual, expectedDelimiter);
    }

}