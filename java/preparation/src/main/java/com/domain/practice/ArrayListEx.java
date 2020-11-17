package com.domain.practice;

import java.util.ArrayList;
public class ArrayListEx {
   
    public static void main(String[] args) {
       ArrayList<Integer> s = new ArrayList<Integer>();
       s.add(55);
       s.add(12);
       s.add(33);
       s.add(77);
       System.out.println(s.get(4));
    }
}