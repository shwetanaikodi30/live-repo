package com.domain.ocjp;

public class Q30P62 {
    public static void main(String args[]) {
        String s = "Hi";
        StringBuffer sb = new StringBuffer(s);
        String s1 = new String("There");
        StringBuffer sb1 = new StringBuffer(s1);
        if (s == sb) {
            System.out.println("s==sb");
        }
        if (s.equals(sb)) {
            System.out.println("s.equals(sb)");
        }
        if (s1.equals(sb1)) {
            System.out.println("s1.equals(sb1)");
        }
    }
}

// It will not compile at if(s==sb) because operands on both side are not
// compatible