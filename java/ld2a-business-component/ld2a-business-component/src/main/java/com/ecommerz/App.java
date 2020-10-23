package com.ecommerz;

import java.util.List;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLPXX?allowPublicKeyRetrieval=true&useSSL=false", "MLPXX",
                    "MLPXX");
            List<Employee> employeeList = dbi.onDemand(EmployeeDAO.class).list();
            // Employee List converted into an Array
            Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);
            for (Employee employee : employees) {
                System.out.print(employee.getEmpId() + " ");
                System.out.println(employee.getFirstName());
            }
        } catch (Exception e) {
            System.out.println("Error Connecting to Database!" + e);
        }

    }
}
class Employee {
    private int empId;
    //FIRST_NAME should be the column
    private String firstName;
    public Employee(int argEmpId) {
        this.empId = argEmpId;
    }
    public Employee(int empId, String firstName) {
        this.empId = empId;
        this.firstName = firstName;
	}
	public final int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}

// Configure the query and get the employee list
interface EmployeeDAO {
    @SqlQuery("SELECT * FROM EMPLOYEE")
    @Mapper(EmployeeMapper.class)
    List<Employee> list();
}

