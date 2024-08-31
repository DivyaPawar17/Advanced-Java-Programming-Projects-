package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.beans.User;
import example.beans.UserValidator;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns={"/Login"},name="myLoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Logged IN ").append(request.getContextPath());
		String userName=request.getParameter("user_name");
		String userPassword=request.getParameter("user_password");
		//System.out.println(userName+" - "+userPassword);
		
		//Populating User Object based upon userName and userPassword
		
		User currentUser=new User(userName,userPassword);
		//System.out.println(currentUser);
		
		//Passing this User object to UserValidator for checking the validity
		boolean valid=UserValidator.isValid(currentUser);
		//System.out.println("Validation Status:"+valid);
		
		//prepare for sending response
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String responseText="<h1 style='color:red'>Sorry, Authentication Failed</h1>";
		if(valid)
			responseText="<h1 style='color:Green'>Congratulation, You are done</h1>";
		
		out.println(responseText);
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
