package ru.kuznetsoviv.gcroot;

import java.util.Scanner;

public class GcRoot {

    public static void main(String[] args) {
        var aaa = new AAA();
        var bbb = new BBB(aaa);
        var bbb1 = new BBB(new AAA());
        System.out.println("Start of program!, press any key to continue");
        new Scanner(System.in).nextLine();

        aaa = null;
        bbb1.setAaa(null);
        System.out.println("Press any key to continue");
        new Scanner(System.in).nextLine();
        System.out.print("End of program!");
    }

    private static class AAA {

    }

    private static class BBB {

        private AAA aaa;

        public BBB(AAA aaa) {
            this.aaa = aaa;
        }

        public void setAaa(AAA aaa) {
            this.aaa = aaa;
        }

        public AAA getAaa() {
            return aaa;
        }
    }

}
