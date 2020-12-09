package com.epam.rd.at.how_to_start.utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

public class OutputHelper {

    public static String[] readOutput(Action action) {
        PrintStream systemOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        try {
            action.callAction();
            return Stream.of(testOut.toString().split("\r?\n"))
                    .map(String::trim).filter(s -> !s.isEmpty()).toArray(String[]::new);
        } finally {
            System.setOut(systemOut);
        }
    }

    public interface Action {
        void callAction();
    }

}
