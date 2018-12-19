package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class AddVat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");

        Function<String, Double> pardeToDouble = Double::parseDouble;

        Function<Double, Double> addVat = x -> x * 1.20;

        System.out.println("Prices with VAT:");
        for (String s : input) {
            String result = String.format("%.2f", addVat.apply(pardeToDouble.apply(s)));
            System.out.println(result);
        }




    }
}
