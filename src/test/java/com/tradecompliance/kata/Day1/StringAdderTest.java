package com.tradecompliance.kata.day1;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class StringAdderTest {

    @Test
    public void forInputStringWhenEmptyReturnZero() {
        StringAdder classUnderTest = new StringAdder();
        String inputString = "";
        int expected = 0;
        int actual = classUnderTest.add(inputString);
        assertEquals(actual, expected);
    }

    @Test
    public void forInputStringWhenOneReturnOne() {
        StringAdder classUnderTest = new StringAdder();
        String inputString = "1";
        int expected = 1;
        int actual = classUnderTest.add(inputString);
        assertEquals(actual, expected);
    }

    @Test
    public void forInputStringWhenOneAndTwoReturnThree() {
        StringAdder classUnderTest = new StringAdder();
        String inputString = "1,2";
        int expected = 3;
        int actual = classUnderTest.add(inputString);
        assertEquals(actual, expected);
    }

    //handle unknown amount of input
    @Test
    public void forInputStringWhenInputIsMoreThanTwoReturnSum() {
        StringAdder classUnderTest = new StringAdder();
        String inputString = "1,2,3,4,5";
        int expected = 15;
        int actual = classUnderTest.add(inputString);
        assertEquals(actual, expected);
    }

    //handle newline between numbers in input
    @Test
    public void forInputStringWhenInputContainsNewlineCharReturnSum() {
        StringAdder classUnderTest = new StringAdder();
        String inputString = "1,2,3\n4,5";
        int expected = 15;
        int actual = classUnderTest.add(inputString);
        assertEquals(actual, expected);
    }


}