package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//This method gets invoked when client makes a request
		//Generate in Html response
		//doget is non static method
		response.setContentType("text/html");//MIME Type. -->Multipuropse Internet mail Extension
		PrintWriter out = response.getWriter();
		String responseText = "<h1 style = 'background-color:blue;color:yellow'>Welcome From Servlet</h1>";
		out.println(responseText);
	} 

}
