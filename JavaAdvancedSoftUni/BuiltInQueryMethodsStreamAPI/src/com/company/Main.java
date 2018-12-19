package com.company;
//P01_TakeTwo task

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] tokens = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(tokens).filter(x -> x >= 10 && x <= 20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.println(x + " "));


    }
}
