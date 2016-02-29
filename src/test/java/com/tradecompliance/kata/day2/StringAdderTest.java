package com.tradecompliance.kata.day2;

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
    public void givenInputStringWhenInputIsEmptyReturnZero() {
        String input = "";
        Integer expected = 0;
        Integer actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }



}