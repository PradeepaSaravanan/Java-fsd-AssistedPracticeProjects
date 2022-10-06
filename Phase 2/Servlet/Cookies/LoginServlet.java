package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String uname= request.getParameter("uname");
		String pword= request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		
		if(pword.equals("abc123"))
		{
			Cookie cookie=new Cookie("Username", uname);
			response.addCookie(cookie);
			RequestDispatcher rs=request.getRequestDispatcher("link.html");
			rs.forward(request, response);
		}
		else
		{
			out.println("Sorry, invalid username ands password");
			RequestDispatcher rs=request.getRequestDispatcher("Login.html");
			rs.include(request, response);
		}
		
	}

}
