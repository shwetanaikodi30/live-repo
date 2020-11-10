package com.domain.ocjp1;

public class QM13P55 {
    class InnerClass {
        int i = 10;
    }

    public void innerClassDemo() {
        // Explicit instance of InnerClass
        QM13P55.InnerClass i = new QM13P55.InnerClass();
        System.out.println(i.i);
        InnerClass z = new QM13P55().new InnerClass();
        System.out.println(z.i);

        // InnerClass i=QM13P55.InnerClass();
    }

    public static void main(String[] args) {
        QM13P55 n = new QM13P55();
        n.innerClassDemo();
    }
}