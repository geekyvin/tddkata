package com.tradecompliance.kata.day8;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAdderTest {

    private StringAdder stringAdder;

    @Before
    public void init() {
        stringAdder = new StringAdder();
    }

    @Test
    public void forInputString_InputIsEmpty_ReturnZero() {
        String input = "";
        int expected = 0;
        int actual = stringAdder.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void forInputString_InputIsOne_ReturnOne() {
        String input = "1";
        int expected = 1;
        int actual = stringAdder.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void InputIsOneAndTwo_ChangedDelimitter_ReturnThree() {
        String input = "//;\n1;2";
        int expected = 3;
         int actual = stringAdder.add(input);
        assertEquals(expected, actual);
    }

}