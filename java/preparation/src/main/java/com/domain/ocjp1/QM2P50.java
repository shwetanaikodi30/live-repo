package com.domain.ocjp1;

public class QM2P50 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;
        int x1, y1, z1;
        x1 = ++y;
        y1 = z++;
        z1 = z;

        System.out.println(x1 + "\n" + y1 + "\n" + z1);
    }
}
