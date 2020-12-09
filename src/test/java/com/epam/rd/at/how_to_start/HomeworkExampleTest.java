package com.epam.rd.at.how_to_start;

import com.epam.rd.at.how_to_start.utils.OutputHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkExampleTest {

    @Test
    void printHelloWorld() {
        String[] strings = OutputHelper.readOutput(HomeworkExample::printHelloWorld);
        assertEquals("Hello world!", strings[0], "Result is incorrect");
    }

    @Test
    void generateNumbers() {
        int x = 5;
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = HomeworkExample.generateNumbers(x);
        assertArrayEquals(expected, result, "Result is incorrect for generateNumbers, x=" + x);
    }

}