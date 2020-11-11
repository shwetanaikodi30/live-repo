package com.domain.ocjp1;

// Consider the following line of code:
public class QM1P50 {
    public void main() {
        System.out.println("Hi");
    }

    public void main(String args) {
        System.out.println("main(String args)");
    }

    public static void main(String arguments[]) {
        QM1P50 t = new QM1P50();
        t.main();
        t.main("");
    }
}

// What will be happen if you compile and run above program?
// A. It will not compile
// B. It will not run
// C. It will compile but will not run
// D. It will output "Hi"
