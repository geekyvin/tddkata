package com.tradecompliance.kata.ex1;

import java.util.Arrays;
import java.util.List;

public class StringAdder {

    public int add(String input) {
        int sum = 0;
        if(input.isEmpty()) {
            return sum;
        }
        //from "," to \D [non-digit] for Condition 3
        List<String> inputNumbers = Arrays.asList(input.split("[\\D]"));
        //String[] inputNumbers = input.split("[,\n]");
        for(String number: inputNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
