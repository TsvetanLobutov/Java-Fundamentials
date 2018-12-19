package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        while (count-- > 0){
            String[] info = reader.readLine().split(" ");
            Person person = new Person(info[0],info[1],Integer.parseInt(info[2]),
                    Double.parseDouble(info[3]));
            people.add(person);
        }

        int bonus = Integer.parseInt(reader.readLine());

//        people.sort((firstPerson, secondPerson) -> {
//            int comp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
//
//            if(comp == 0){
//                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//
//            return comp;
//        });

        people.forEach(person ->{
            person.increaseSalery(bonus);
            System.out.println(person);
        });

    }
}
