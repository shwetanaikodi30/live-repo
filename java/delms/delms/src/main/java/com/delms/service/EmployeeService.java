package com.delms.service;

import java.util.List;

import com.delms.model.Employee;
import com.delms.persistence.DbConnection;
import com.delms.persistence.EmployeeDAO;

import org.skife.jdbi.v2.DBI;

public class EmployeeService {
   //CREATE AN EMPLOYEE
   // IT NEEDS DATA FROM THE DATABASE (DELMSDB)
   // IT NEEDS A MODEL (EMPLOYEE)
   // CREATES A MODEL AND POPULATES IT WITH DATA. 
   // USES A DAO (DATA ACCESS OBJECTS) (EmployeeDAO)


   private static EmployeeDAO dao(){
      //    DbConnection db = new DbConnection();
   //  return db.getConnect().onDemand(EmployeeDAO.class);
      DbConnection dbConnection = new DbConnection();
      DBI dbi = dbConnection.getConnect();
      EmployeeDAO employeeDAO = dbi.onDemand(EmployeeDAO.class);
      return employeeDAO;
   }

   public static Employee[] listAllEmployees(){
      EmployeeDAO employeeDAO = dao();
      List<Employee> employeesList = employeeDAO.listOfAllEmployees();
      Employee [] employeesArray = new Employee[employeesList.size()];
      return employeesList.toArray(employeesArray);
   }
}
