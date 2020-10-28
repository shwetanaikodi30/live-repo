package com.delms.persistence;

import java.util.List;

import com.delms.model.Employee;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
public interface EmployeeDAO {
   //CONTAINS THE SQL QUERY
   //CONNECTS TO THE DB DbConnection
   //GETS THE ROWS AND POPULATES INSIDE MODEL
   //RETURNS THE MODEL
   // EACH ROW = AN EMPLOYEE OBJECT
   // EACH COLUMN = 1 FIELD with the help of Mapper (EmployeeMapper)


   //GETS THE ROWS AND POPULATES INSIDE MODEL WITH THE HELP OF EmployeeMapper
   //List<Employee> list();
   @SqlQuery ("SELECT * FROM EMPLOYEE")
   @Mapper(EmployeeMapper.class)
   List<Employee> listOfAllEmployees();
}
