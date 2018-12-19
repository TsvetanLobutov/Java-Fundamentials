package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Predicate<String> isUpper = x -> Character.isUpperCase(x.charAt(0));

        List<String> uppers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if(isUpper.test(input[i])){
                uppers.add(input[i]);
            }
        }
        System.out.println(uppers.size());
        uppers.forEach(System.out::println);

    }
}
