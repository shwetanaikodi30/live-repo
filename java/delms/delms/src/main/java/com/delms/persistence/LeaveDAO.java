package com.delms.persistence;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
public interface LeaveDAO {
   
   @SqlUpdate("INSERT INTO LEAVE_DETAILS (LEAVE_ID, EMP_ID,REASON) VALUES (:LEAVE_ID, :EMP_ID,:REASON)")
   @Mapper(EmployeeMapper.class)
   int applyLeave(@Bind("LEAVE_ID") int leaveId,@Bind("EMP_ID") int empId, @Bind("REASON")String reason);
}
