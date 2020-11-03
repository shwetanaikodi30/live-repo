package com.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GettingStartedTest {
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
}
