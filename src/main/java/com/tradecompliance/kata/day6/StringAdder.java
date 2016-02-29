package com.tradecompliance.kata.day6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {
        String delimmiter = "[,]|[\n]";
        //Any char following '//'
        Matcher delimmiterMatcher = Pattern.compile("^(//)(.)").matcher(numbers);
        if(delimmiterMatcher.find()) {
            delimmiter = "["+delimmiterMatcher.group(0)+"|\n]";
        }
        numbers = numbers.replaceAll(delimmiterMatcher.group(0), "")
                .replaceFirst(delimmiterMatcher.group(1), "");
        return Arrays.asList(numbers.split(delimmiter))
                .stream().map((s) -> mapToInt(s)).reduce(0, (a,b) -> a+b);
    }

    private int mapToInt(String a) {
        if (a.isEmpty() || a.matches("\\D")) {
            return 0;
        } else {
            return Integer.parseInt(a);
        }
    }

    private int appendToSum(String a, int sum) {
        if(a.isEmpty()||a.matches("\\D")) {
            return 0;
        } else {
            return Integer.parseInt(a)+sum;
        }
    }
}