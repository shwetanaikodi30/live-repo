package com.domain.ocjp1;

//base static - derived static - base instance - base cons - derived ins - derived cons.
//If constructor is overridden in the base, 
// either the default constructor should be written or
// the dervied constructor should call the base parameterized constructor.
public class QM12P54_Parent {
    public QM12P54_Parent() {
        System.out.println("base cons");
    }

    public QM12P54_Parent(int x, int y) {
        System.out.println("Created Parent");
    }
}// end of Parent class

class QM12P54b_Child extends QM12P54_Parent {
    // public QM12P54b_Child(int x, int y) {
    // //
    // }

    public QM12P54b_Child(int x, int y, int z) {
        // super(5, 2);
        //super call should be in the first line of your constructor
        //super();
        System.out.println("Creating child");
        // this(x, y);

    }

    public static void main(String[] args) {
        QM12P54b_Child c = new QM12P54b_Child(1, 2, 3);
    }
}