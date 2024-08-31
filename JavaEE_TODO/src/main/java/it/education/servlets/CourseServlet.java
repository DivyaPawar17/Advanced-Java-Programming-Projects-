package it.education.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet(urlPatterns={"/createNewCourse"},name="myCreateCourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String courseId=request.getParameter("course_id");
		String courseName=request.getParameter("course_name");
		String courseProvider=request.getParameter(" course_provider");
		String courseDuration=request.getParameter(" course_duration");
		String courseFees=request.getParameter("  course_fees");
		System.out.println(courseId+" - "+courseName+"-"+courseProvider+"-"+courseDuration+"-"+courseFees);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
