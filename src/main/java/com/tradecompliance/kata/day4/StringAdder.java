package com.tradecompliance.kata.day4;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {

    public int add(String numbers) {

        int sum = 0;
        String delimmiter = "[,]|[\n]";
        //Any char following '//'
        Matcher delimmiterMatcher = Pattern.compile("^//.").matcher(numbers);
        if(numbers.isEmpty()) {
            return sum;
        } else if(delimmiterMatcher.find()) {
            delimmiter = "["+delimmiterMatcher.group(0)+"|\n]";
        }
        numbers.replaceAll("\\\\", numbers);

        List<String> inputNumbers = Arrays.asList(numbers.split(delimmiter));
        for(String number: inputNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
