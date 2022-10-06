package details;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int productId= Integer.parseInt(request.getParameter("prod_id"));
		String productName= request.getParameter("prod_name");
		int quantity= Integer.parseInt(request.getParameter("Quantity"));
		int price= Integer.parseInt(request.getParameter("Price"));
		
		HttpSession session=request.getSession();  
        session.setAttribute("prod_id",  productId);

        session.setAttribute("prod_name",  productName);

        session.setAttribute("Price",  price);

        session.setAttribute("Quantity",  quantity);
        response.sendRedirect("display.jsp");  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
