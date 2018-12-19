package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Static Id and Rate

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        Map<Integer, BankAccount> account = new HashMap<>();

        while(!"End".equals(line = reader.readLine())){
            String[] commandArgs = line.split(" ");

            switch (commandArgs[0]){
                case"Create":
                    BankAccount acc = new BankAccount();
                    account.put(acc.getId(), acc);
                    System.out.println("Account ID"+ acc.getId()+ " created");
                    break;
                case"Deposit":
                    int id = Integer.valueOf(commandArgs[1]);
                    double amount = Double.valueOf(commandArgs[2]);

                    try{
                        account.get(id).deposit(amount);
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;
                case"SetInterest":
                    BankAccount.setInterest(Double.parseDouble(commandArgs[1]));
                    break;
                case"GetInterest":
                    try {
                        System.out.printf("%2f",
                                account.get(Integer.parseInt(commandArgs[1]))
                                .getInterestRate(Integer.parseInt(commandArgs[2])));
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;
            }

        }


    }
}
