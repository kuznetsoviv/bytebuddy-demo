package ru.kuznetsoviv.gc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StopTheWorldGc {

    private static class WorkThread extends Thread {

        private List<byte[]> list = new ArrayList<>();

        public void run() {
            try {
                while (true) {
                    for (int i = 0; i < 1000; i++) {
                        byte[] buffer = new byte[1024];
                        list.add(buffer);
                    }
                    if (list.size() > 400_000) {
                        list.clear();
                        System.gc();
                    }
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

    private static class PrintThread extends Thread {

        public final long startTime = System.currentTimeMillis();

        public void run() {
            try {
                while (true) {
                    long t = System.currentTimeMillis() - startTime;
                    System.out.println(t / 1000 + "." + t % 1000);
                    Thread.sleep(1000);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        if (Arrays.asList(args).contains("worker")) {
            WorkThread workThread = new WorkThread();
            workThread.start();
        }
        PrintThread printThread = new PrintThread();
        printThread.start();
    }

}
