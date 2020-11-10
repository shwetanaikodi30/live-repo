package com.domain.ocjp1;

public class QM3P50 {
    public int addTest(int x, int y) {
        x = x + 1;
        y = y + 1;
        int z = (x + y);
        return z;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 0;
        QM3P50 t = new QM3P50();
        z = t.addTest(x, y);
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}
