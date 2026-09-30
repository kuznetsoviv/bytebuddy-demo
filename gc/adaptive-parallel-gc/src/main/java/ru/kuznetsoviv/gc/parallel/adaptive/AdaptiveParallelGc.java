package ru.kuznetsoviv.gc.parallel.adaptive;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdaptiveParallelGc {

    public static void main(String[] args) throws InterruptedException {
        Map<String, String> stringContainer = new HashMap<>();
        String stringWithPrefix = "stringWithPrefix";
        System.out.println("Start of program!, press any key to continue");
        new Scanner(System.in).nextLine();
        System.out.println("Start loop");

        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 500_000; i++) {
                String newString = stringWithPrefix + i;
                stringContainer.put(newString, newString);
            }
            for (int i = 0; i < 500_00; i++) {
                String newString = stringWithPrefix + i;
                stringContainer.remove(newString);
            }

            Thread.sleep(100);
        }

        System.out.println("end loop");
        new Scanner(System.in).nextLine();
        System.out.println("End of program!");
    }

}
