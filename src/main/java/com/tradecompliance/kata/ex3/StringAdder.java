package com.tradecompliance.kata.ex3;

import java.util.Arrays;
import java.util.List;

public class StringAdder {

    public int add(String numbers) {
        int sum = 0;
        String delimmiter = "[,]|[\n]";
        if(numbers.isEmpty()) {
            return sum;
        }

        List<String> inputNumbers = Arrays.asList(numbers.split(delimmiter));
        //String[] inputNumbers = input.split("[,\n]");
        for(String number: inputNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
