package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        StringBuilder justWords = new StringBuilder();
        while (words.hasNext()) {
            String next = words.next();
            try {
                int number = Integer.parseInt(next);
                sum += number;
            } catch (NumberFormatException e) {
                justWords.append(next);
                justWords.append(" ");
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words:" + justWords);
    }
}

