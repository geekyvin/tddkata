package com.tradecompliance.kata.day10;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {
        String delimmiter = getDelimiter(numbers);
        numbers = numbers.replaceFirst("//"+delimmiter+"\n", "");
        return Arrays.asList(numbers.split(delimmiter))
                .stream().map((s) -> mapToInt(s)).reduce(0, (a,b) -> a+b);
    }

    private int mapToInt(String a) {
        if (a.matches("\\d")) {
            return Integer.parseInt(a);
        } else {
            return 0;
        }
    }

    private int appendToSum(String a, int sum) {
        if(a.matches("[\\d]")) {
            return Integer.parseInt(a)+sum;
        } else {
            return 0;
        }
    }

    public String getDelimiter(String numbers) {
        String delimitter = "[,]|[\n]";
        String delimmiterPattern = "//(.{1})";
        Matcher delimmiterMatcher = Pattern.compile(delimmiterPattern).matcher(numbers);
        if(delimmiterMatcher.find()) {
            delimitter = delimmiterMatcher.group(1);
        }
        return delimitter;
    }



}