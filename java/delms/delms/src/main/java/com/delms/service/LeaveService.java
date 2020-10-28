package com.delms.service;

import java.util.List;

import com.delms.model.Employee;
import com.delms.persistence.DbConnection;
import com.delms.persistence.LeaveDAO;

import org.skife.jdbi.v2.DBI;

public class LeaveService {
   //CREATE AN EMPLOYEE
   // IT NEEDS DATA FROM THE DATABASE (DELMSDB)
   // IT NEEDS A MODEL (EMPLOYEE)
   // CREATES A MODEL AND POPULATES IT WITH DATA. 
   // USES A DAO (DATA ACCESS OBJECTS) (LeaveDAO)

   private static LeaveDAO dao(){

      DbConnection dbConnection = new DbConnection();
      DBI dbi = dbConnection.getConnect();
      LeaveDAO leaveDAO = dbi.onDemand(LeaveDAO.class);
      return leaveDAO;
   }

   public static int insertLeave(int leaveId, int empId, String reason){
      LeaveDAO LeaveDAO = dao();
      int noOfRowsInserted  =  LeaveDAO.applyLeave(leaveId, empId, reason);
      return noOfRowsInserted;
   }
}
