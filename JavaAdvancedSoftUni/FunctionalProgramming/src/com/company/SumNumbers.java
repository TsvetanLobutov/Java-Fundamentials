package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().trim().split(", ");

        Function<String, Double> parser = Double::parseDouble;

        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += parser.apply(input[i]);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);


    }
}
