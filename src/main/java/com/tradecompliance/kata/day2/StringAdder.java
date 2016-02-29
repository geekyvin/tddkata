package com.tradecompliance.kata.day2;

import java.util.Arrays;
import java.util.List;

public class StringAdder {

    public int add(String numbers) {
        int sum = 0;
        if(numbers.isEmpty()) {
            return sum;
        }
        //from "," to \D [non-digit] for Condition 3
        List<String> inputNumbers = Arrays.asList(numbers.split("[\\D]"));
        //String[] inputNumbers = input.split("[,\n]");
        for(String number: inputNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
