package com.tradecompliance.kata.day5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {
        int sum = 0;
        String delimmiter = "[,]|[\n]";
        //Any char following '//'
        Matcher delimmiterMatcher = Pattern.compile("^(//)(.)").matcher(numbers);
        if(numbers.isEmpty()) {
            return sum;
        } else if(delimmiterMatcher.find()) {
            delimmiter = "["+delimmiterMatcher.group(0)+"|\n]";
        }
        numbers = numbers.replaceAll(delimmiterMatcher.group(0), "")
                .replaceFirst(delimmiterMatcher.group(1), "");
        return Arrays.asList(numbers.split(delimmiter))
                .stream().mapToInt(s -> Integer.parseInt(s)).sum();
    }
}
