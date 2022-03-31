package MyServlet;
import Model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import model.Product;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class productproj
 */
public class productproj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productproj() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productID=request.getParameter("productid");
		String productName=request.getParameter("productname");
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		
		/*request.setAttribute("pname", productName);
		request.getRequestDispatcher("productReceivePage.jsp").forward(request, response);
		Product p=new Product(productid,productName,price,quantity);
		System.out.println(p);*/
		


		
		
		Product product=new Product(productID, productName, price, quantity);
		System.out.println(product);
		
		//request.setAttribute("PROD",product);
		request.getRequestDispatcher("productrecivepage.jsp").forward(request, response);
		
	}

	
	

	}
	
	


