package com.ecommerz;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

public class EmployeeMapper implements ResultSetMapper<Employee> {
    @Override
    public Employee map(int index, ResultSet rs, StatementContext ctx) throws SQLException {
        //return new Employee(rs.getInt("EMP_ID"));
        return new Employee(rs.getInt("EMP_ID"),rs.getString("FIRST_NAME"));
    }
}