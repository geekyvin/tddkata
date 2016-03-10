package com.tradecompliance.kata.day12;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {
        String delimmiter = getDelimiter(numbers);
        numbers = numbers.replaceFirst("//"+delimmiter+"\n", "");
        return Arrays.asList(numbers.split(delimmiter))
                .stream().map((s) -> mapToInt(s)).reduce(0, (a,b) -> appendToSum(a, b));
    }

    private int mapToInt(String a) {
        if (a.matches("^-?\\d+$")) {
            return Integer.parseInt(a);
        } else {
            return 0;
        }
    }

    private int appendToSum(int sum, int a) {
        if(a < 0) {
            throw new NegativeNumberException("The given number is negative!");
        } else if( a > 1000){
            return sum;
        } else {
            return a + sum;
        }

    }

    public String getDelimiter(String numbers) {
        String delimitter = "[,]|[\n]";
        String delimmiterPattern = "(?<=//)(.*)(?=\n)";
        Matcher delimmiterMatcher = Pattern.compile(delimmiterPattern).matcher(numbers);
        if(delimmiterMatcher.find()) {
            delimitter = delimmiterMatcher.group(1);
        }
        return delimitter;
    }



}