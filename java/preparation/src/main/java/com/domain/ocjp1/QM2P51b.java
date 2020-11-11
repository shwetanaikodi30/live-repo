package com.domain.ocjp1;

class ListManager {
    public void expandList(QM4P51a l) {
        l.size = l.size + 10;
    }
    public void expandList(int l) {
       l = l+100;
       System.out.println(l);
    }
}// end of ListManager
