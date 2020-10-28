package com.delms.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.delms.model.Employee;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class EmployeeMapper implements ResultSetMapper<Employee> {

      @Override
      public Employee map(int index, ResultSet r, StatementContext ctx) throws SQLException {
            int empId = r.getInt("EMP_ID");
            String firstName = r.getString("FIRST_NAME");
            Employee employee = new Employee(empId, firstName);
            return employee;
      }
      // EACH COLUMN = 1 FIELD with the help of Mapper (EmployeeMapper)
}
