package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        numbers.removeIf(x -> x % 2 != 0);
            System.out.println(String.join(", ", numbers.toString()
                    .replace("[", "")
                    .replace("]", "")));


        numbers.sort((a,b) -> a.compareTo(b));
        System.out.println(String.join(", ", numbers.toString()
                .replace("[","")
                .replace("]","")));

    }
}
