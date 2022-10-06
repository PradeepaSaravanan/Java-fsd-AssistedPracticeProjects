package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayInfo")
public class DisplayInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayInfo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		try {
		      
			//get connection
		Connection con=DBconnection.getConnection();
	         //create sql command 
	String str= "select * from Student";
    Statement stmt= con.createStatement();
    
    ResultSet rs=stmt.executeQuery(str); // always store datta in the form of table
    PrintWriter out= response.getWriter();
    //read records from result set
    while(rs.next())
    {
    	out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getFloat(3));
    }
    // con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
