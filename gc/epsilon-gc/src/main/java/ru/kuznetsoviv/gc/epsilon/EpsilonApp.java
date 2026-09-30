package ru.kuznetsoviv.gc.epsilon;


import java.util.Scanner;

public class EpsilonApp {

    public static void main(String[] args) {
        System.out.println("Start of program!, press any key to continue");
        new Scanner(System.in).nextLine();
        System.out.print("start loop");

        for (int i = 200_000; i < 2_000_000; i++) {
            String newString = String.valueOf(i);
        }
        System.out.println("end loop");
    }

}
