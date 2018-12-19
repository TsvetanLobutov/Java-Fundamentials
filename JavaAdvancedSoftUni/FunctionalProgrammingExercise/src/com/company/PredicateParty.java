package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PredicateParty {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<String> people = getPeople();
        operateOnList(people);
        printPeople(people);
    }

    private static void printPeople(List<String> people) {
        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.valueOf(people).replace("[", "")
                    .replace("]", "") + " are going to the party!");
        }
    }

    private static void operateOnList(List<String> people) throws IOException {
        String inputLine = reader.readLine();
        while (!"Party!".equals(inputLine)) {
            String[] commands = inputLine.split(" ");
            switch (commands[0]) {
                case "Double":
                    switch (commands[1]) {
                        case "StartsWith":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).startsWith(commands[2])) {
                                    people.add(i, people.get(i));
                                }
                            }
                            break;
                        case "EndsWith":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).endsWith(commands[2])) {
                                    people.add(i, people.get(i));
                                }
                            }
                            break;
                        case "Length":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).length() == Integer.parseInt(commands[2])) {
                                    people.add(i, people.get(i));
                                }
                            }
                            break;
                    }
                    break;
                case "Remove":
                    switch (commands[1]) {
                        case "StartsWith":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).startsWith(commands[2])) {
                                    people.remove(people.get(i));
                                }
                            }
                            break;
                        case "EndsWith":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).endsWith(commands[2])) {
                                    people.remove(people.get(i));
                                }
                            }
                            break;
                        case "Length":
                            for (int i = people.size() - 1; i >= 0; i--) {
                                if (people.get(i).length() == Integer.parseInt(commands[2])) {
                                    people.remove(people.get(i));
                                }
                            }
                            break;
                    }
                    break;
            }
            inputLine = reader.readLine();
        }
    }
    private static List<String> getPeople() throws IOException {
        List<String> people = new ArrayList<>();
        String[] inputPeople = reader.readLine().split(" ");
        for (String inputPerson : inputPeople) {
            people.add(inputPerson);
        }
        return people;
    }

}

