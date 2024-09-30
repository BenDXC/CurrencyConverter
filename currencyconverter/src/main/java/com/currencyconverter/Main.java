package com.currencyconverter;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        do {
            HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

            currencyCodes.put(1, "GBP");
            currencyCodes.put(2, "USD");
            currencyCodes.put(3, "EUR");
            currencyCodes.put(4, "CAD");
            currencyCodes.put(5, "INR");

            Integer from, to;
            String fromCode, toCode;
            double amount;

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the currency converter");

            System.out.println("Currency Converting from?");
            System.out.println("1:GBP\t 2:USD\t 3:EUR\t 4:CAD\t 5:INR");
            from = sc.nextInt();
            while (from < 1 || from > 5) {
                System.out.println("Please select a valid currency (1 - 5)");
                System.out.println("1:GBP\t 2:USD\t 3:EUR\t 4:CAD\t 5:INR");
                from = sc.nextInt();
            }
            fromCode = currencyCodes.get(from);

            System.out.println("Currency Converting to?");
            System.out.println("1:GBP\t 2:USD\t 3:EUR\t 4:CAD\t 5:INR");
            to = sc.nextInt();
            while (to < 1 || to > 5) {
                System.out.println("Please select a valid currency (1 - 5)");
                System.out.println("1:GBP\t 2:USD\t 3:EUR\t 4:CAD\t 5:INR");
                to = sc.nextInt();
            }
            toCode = currencyCodes.get(to);

            System.out.println("Amount you wish to convert?");
            amount = sc.nextFloat();

            try {
                httpRequest.sendHttpGETRequest(fromCode, toCode, amount);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Do you want to use the converter again?");
            System.out.println("1: Yes\t Any Other Key: NO");
            if (sc.nextInt() != 1) {
                running = false;
            }
        } while (running);
        System.out.println("Thank you for using the converter");

    }
}