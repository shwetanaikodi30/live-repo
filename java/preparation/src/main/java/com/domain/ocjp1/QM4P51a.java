package com.domain.ocjp1;

public class QM4P51a {
    int size = 1;

    public static void main(String[] args) {
        QM4P51a list = new QM4P51a();
        list.size = 10;
        ListManager lm = new ListManager();
        //passing the reference (address)
        //address is copied.
        lm.expandList(list);
        System.out.println("list.size=" + list.size);

        int l = 100;
        //passing the value (value is copied)
        lm.expandList(l);
        System.out.println(l);
    }
} // end of QM3P50
