package com.sarvex.functionsAsValues;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * Created by Sarvex on 23/03/2015.
 */
public class MinimumLambdaExamples {

    public static void main(final String[] args) {
        IntToDoubleFunction incrementalCosts = time -> 5.1 + 0.15 * time;

        Function<String, Integer> wordCount = string -> string.split(" ").length;

        BiFunction<String, Integer, Boolean> exceedsMaxLength = (string, maxLength) -> {
            int actualLength = string.length();
            return actualLength > maxLength;
        };
    }
}
