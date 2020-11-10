package com.domain.ocjp1;

//QM9P53 child class
//QM9P53b parent class
class QM9P53 extends QM9P53b {
    public QM9P53(int x) {
        System.out.println("I am Child");
    }

    public QM9P53() {
        System.out.println("I am Child");

    }

    public static void main(String[] args) {
        QM9P53 c = new QM9P53(10);

    }
}
