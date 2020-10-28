package com.delms.model;

public class Employee {
   private int empId;
   private String firstName;

   public Employee(int empId, String firstName) {
      this.empId = empId;
      this.firstName = firstName;
   }

   public String getFirstName() {
      return firstName;
   }

   public int getEmpId() {
      return empId;
   }
}
