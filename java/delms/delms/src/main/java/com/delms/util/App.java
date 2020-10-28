package com.delms.util;

import java.util.Scanner;

import com.delms.model.Employee;
import com.delms.service.EmployeeService;
import com.delms.service.LeaveService;

public class App {
  private Scanner option = new Scanner(System.in, "UTF-8");

  public static void main(String[] args) {
    App mainObj = new App();
    // mainObj.mainMenu();
    //mainObj.listEmployeesDetails();
    mainObj.applyLeave();
  }

  private void listEmployeesDetails() {
    Employee[] employees = EmployeeService.listAllEmployees();
    for (Employee employee : employees) {
      System.out.println(employee.getEmpId());
      System.out.println(employee.getFirstName());
    }
  }

  private void applyLeave() {
    LeaveService leaveService = new LeaveService();
    int row = leaveService.insertLeave(123, 321, "I want to got to Himalayas!");
    System.out.println( "Inserted "  + row + " row.");
  }

  private void listEmployeeDetail() {
    // System.out.println("Enter an Employee Id");
    // int empId = option.nextInt();

    // NEED ALL EMPLOYEE DATA
    // WRITE A FACTORY CLASS TO CREATE THE EMPLOYEE DATA AND STORE INSIDE EMPLOYEE
    // CLASS (MODEL)
    // MODEL CLASS IS Employee
    // FACTORY CLASS : EmployeeFactory creates Employees
    // SHOE FACTORY creates SHOES

    // Employee employee = EmployeeFactory.listById(empId);
    // if (employee == null) {
    // System.out.println("Sorry, No such employee");
    // } else {
    // System.out.println(employee.getEmpId());
    // }
  }

  private void mainMenu() {

    // * Member 1: List all employee information and Employee information
    // * Member 2: Apply Leave
    // * Member 3: Leave History
    // * Member 4: Pending Leaves
    // * Member 5: Approve/Deny Leaves
    System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1. List All Employees Info");
    System.out.println("2. Display Employee Info");
    System.out.println("3. Apply Leave");
    System.out.println("4. Display Leave History");
    System.out.println("5. Dispaly Pending Leave ");
    System.out.println("6. Approval/Deny Leave");
    System.out.println("Enter your choice:");
    int menuOption = option.nextInt();
    mainMenuDetails(menuOption);
  }

  private void mainMenuDetails(final int selectedOption) {
    switch (selectedOption) {
      case 1:
        listEmployeesDetails();
        break;
      // case 2:
      // listEmployeeDetail();
      // break;
      // case 3:
      // // halt since normal exit throws a stacktrace due to jdbc threads not
      // responding
      // Runtime.getRuntime().halt(0);
      // default:
      // System.out.println("Choose either 1, 2 or 3");
    }
    mainMenu();
  }

}
