package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Employee e= new Employee();
		
		e.setEid(rs.getInt("eid"));
		e.setName(rs.getString("name"));
		e.setDesignation(rs.getString("designation"));
		e.setSalary(rs.getFloat("salary"));
		return e;
		
	}
   
	 
}
