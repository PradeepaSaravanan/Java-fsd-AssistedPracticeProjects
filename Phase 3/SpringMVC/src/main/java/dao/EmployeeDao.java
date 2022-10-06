package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import beans.Employee;

@Component
public class EmployeeDao {
      @Autowired
     JdbcTemplate template;
      
      public List<Employee> getEmployeeDetails(){
    	  String sql="select * from employee";
    	  List<Employee> elist=template.query(sql, new EmployeeMapper());
    	  return elist;
      }
     

}
