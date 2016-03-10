package com.tradecompliance.kata.day12;

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
    public void inputIsOneAndTwo_ChangedDelimitter_ReturnThree() {
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

    @Test(expected = NegativeNumberException.class)
    public void givenInputWithNegativeNumber_CallAdd_ThrowNegativeNumberException() {
        String input = "//;\n-1;2";
        int expected = 1;
        int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void inputIsGreaterThan1000_CallAdd_ReturnSumIngnoring1000() {
        String input = "//;\n1;2;1001;3";
        int expected = 6;
        int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void givenDelimiterWithMoreThanOneChar_CallAdd_ReturnSum() {
        String input = "//[***]\n2***3***4***5";
        int expected = 14;
        int actual = classUnderTest.add(input);
        assertEquals(expected, actual);
    }


}