package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.beans.User;
import example.beans.UserValidator;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet(                             //annotation 
		urlPatterns = {"/doLogin"},
		name = "myLoginServlet"             //servletName
		)     

     
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Logged IN ").append(request.getContextPath());
		
		String userName = request.getParameter("user_name");
		String userPassword = request.getParameter("user_password");
		//System.out.println(userName + "-"+ userPassword);
		
		//Populating User Object based upon userName and userPassword
		User currentUser = new User(userName, userPassword);
		//System.out.println(currentUser);
		
		//Passing this user object to user validator for checking validity
		boolean valid = UserValidator.isValid(currentUser);
		//System.out.println("Validation Status: "+valid);
	
		//prepare for sending response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String responseText = "<h1 style = 'color:red'>Sorry, Authentication Failed</h1>";
		
		if(valid)
		responseText = "<h1 style = 'color:green'>Congratulations, You are in...</h1>";
		
		out.print(responseText);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



    // 1 url http://localhost:9090/Web_App/Login.html

   //2 url http://localhost:9090/Web_App/doLogin?user_name=sys_admin&user_password=mkdix123

// 3 url http://localhost:9090/Web_App/doLogin ----> doPost security implementation here through post method
