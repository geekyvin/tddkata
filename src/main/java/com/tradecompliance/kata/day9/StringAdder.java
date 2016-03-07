package com.tradecompliance.kata.day9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {
        String delimmiter = getDelimmter(numbers);
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


    private String getDelimmter(String numbers) {
        String delimitter = "[,]|[\n]";
        String delimmiterPattern = "(//)(.)";
        Matcher delimmiterMatcher = Pattern.compile(delimmiterPattern).matcher(numbers);
        if(delimmiterMatcher.find()) {
            delimitter = delimmiterMatcher.group(1);
        }
        return delimitter;
    }



}