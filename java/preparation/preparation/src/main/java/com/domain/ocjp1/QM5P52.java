package com.domain.ocjp1;

public class QM5P52 {

    public static void main(String[] args) {
        int x = -1;

        int p = x >>> 32;
        int y = x >>> 5;
        int z = x >> 5;
        int o = ~x;

        System.out.println("\n" + p + "\n" + y + "\n" + z + "\n" + o);
    }
}
