package com.company;

public class Main {

    public static void main(String[] args) {

        RandomArrayList al = new RandomArrayList();

        al.add(5);
        al.add(15);
        al.add(2);
        al.add(55);
        al.add(1);

        System.out.println(al.getRandomElement());

    }
}
