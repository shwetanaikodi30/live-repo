package com.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifecycleTest {
   @Test
   public void testCase1() {
      System.out.println("Test Case 1");
      // assertTrue(true);
      assertTrue(true);
   }

   @Test
   public void testCase2() {
      System.out.println("Test Case 2");
      assertFalse(false);
   }

   // Life Cycle methods
   @BeforeClass
   public static void setupBC() throws Exception{
      System.out.println("Lifecycle : @BeforeClass");
   }
   @AfterClass
   public  static void tearDownAC() throws Exception{
      System.out.println("Lifecycle : @AfterClass");
   }
   @Before
   public  void setup() throws Exception{
      System.out.println("Lifecycle : @Before");
   }
   @After
   public  void tearDown() throws Exception{
      System.out.println("Lifecycle : @After");
   } 
}
