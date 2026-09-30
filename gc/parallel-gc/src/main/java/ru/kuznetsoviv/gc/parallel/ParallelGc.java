package ru.kuznetsoviv.gc.parallel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParallelGc {

    public static void main(String[] args) {
        Map<String, String> stringContainer = new HashMap<>();
        System.out.println("Start of program!");
        String stringWithPrefix = "stringWithPrefix";

        new Scanner(System.in).nextLine();
        System.out.println("start loop 1");

        for (int i = 0; i < 200_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }

        System.out.println("end loop 1");

        new Scanner(System.in).nextLine();
        System.out.println("start loop 2");

        for (int i = 200_000; i < 400_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }

        System.out.println("end loop 2");

        new Scanner(System.in).nextLine();
        System.out.println("start loop 3");

        for (int i = 400_000; i < 800_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }

        System.out.println("end loop 3");

        new Scanner(System.in).nextLine();
        System.out.println("start loop 4");

        for (int i = 0; i < 200_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.remove(newString, newString);
        }

        for (int i = 800_000; i < 4_500_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }

        System.out.println("end loop 4");


        new Scanner(System.in).nextLine();
        System.out.println("End of program!");

    }

}
