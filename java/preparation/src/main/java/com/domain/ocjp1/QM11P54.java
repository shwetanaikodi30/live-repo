package com.domain.ocjp1;

public class QM11P54 {
    public int size = 0;

    static class InnerClass {
        public void incrementParentSize() {
            QM11P54 p = new QM11P54();
            p.size = p.size + 10;

        }
    }
}
