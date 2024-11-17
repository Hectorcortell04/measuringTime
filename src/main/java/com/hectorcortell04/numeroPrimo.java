package com.hectorcortell04;

public class numeroPrimo implements Runnable {
    private int start, end;

    public numeroPrimo(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (esPrimo(i)) {
                System.out.println("El número " + i + " es primo.");
            }
        }
    }
}
