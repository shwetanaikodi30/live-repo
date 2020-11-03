package com.domain;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {
   private static Addition addition;
   // private Addition addition = null;
   @BeforeClass
   public static void setUp() {
      System.out.println("Setup Addition");
      addition = new Addition();
   }
   @AfterClass
   public static void tearDown() {
      System.out.println("Teardown Addition");
      addition = null;
   }

   // @Before
   // public void setUp() {
   //    System.out.println("Setup Addition");
   //    addition = new Addition();
   // }
   // @After
   // public void tearDown() {
   //    System.out.println("Teardown Addition");
   //    addition = null;
   // }
   @Test
   public void test1() {
      System.out.println("Addition");
      int result = addition.add(2, 3);
      System.out.println(addition);
      assertEquals(5, result);
   }

   @Test
   public void test2() {
      System.out.println("Addition");
      System.out.println(addition);
      int result = addition.add(3, 3);
      //assertEquals(5, result);
      assertEquals(6, result);
   }
}
