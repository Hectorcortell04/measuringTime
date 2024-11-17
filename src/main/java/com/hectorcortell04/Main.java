package com.hectorcortell04;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Thread work1 = new Thread(new numeroPrimo(1, 100000));
        Thread work2 = new Thread(new numeroPrimo(100001, 200000));
        Thread work3 = new Thread(new numeroPrimo(100002, 300000));
        Thread work4 = new Thread(new numeroPrimo(100003, 400000));

        work1.start();
        work2.start();
        work3.start();
        work4.start();

        try {
            work1.join();
            work2.join();
            work3.join();
            work4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime + "ms");
    }
}