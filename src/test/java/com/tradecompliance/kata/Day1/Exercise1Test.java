package com.tradecompliance.kata.Day1;

import java.io.Console;

public class Exercise1Test {

    public static void main(String args[]) {
        Console console = System.console();
        String line;
        while (true) {
            StringAdder stringAdder = new StringAdder();
            line = console.readLine();
            if(line.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            stringAdder.add(line.trim());
        }
    }

}