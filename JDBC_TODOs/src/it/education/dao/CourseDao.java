package it.education.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import course.jdbc.utils.*;

import it.education.entity.Course;


public class CourseDao implements DaoInterface<Course, Integer>  {

	@Override
	public Collection<Course> retrieveAll() {
		Collection<Course> allCourses = new ArrayList<>();
		String sqlQuery=" select  course_id, course_name, course_provider, course_duration, course_fees from  Course_Master";
		
		try (
				Connection dbConnection = JdbcUtils.buildConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs= stmt.executeQuery(sqlQuery);

		) {
			while(rs.next()) {
			 int course_id = rs.getInt(1);
			 String course_name = rs.getString(2);
			String course_provider = rs.getString(3);
			int course_duration =rs.getInt(4);
			int course_fees=rs.getInt(5);
			 Course currentCustomer=new Course(course_id,course_name,course_provider,course_duration,course_fees);
			 allCourses.add(currentCustomer);
		 }
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return allCourses;
	}

	@Override
	public Course retriveOne(Integer id) {
		Course foundCourse=null;
		String sqlQuery=" select  course_id, course_name, course_provider, course_duration, course_fees from  Course_Master where course_id=?";
		try(
				Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			ResultSet rs= pstmt.executeQuery();
			
			if(rs.next()) {//if customer exists
				 int course_id = rs.getInt(1);
				 String course_name = rs.getString(2);
				String course_provider = rs.getString(3);
				int course_duration =rs.getInt(4);
				int course_fees=rs.getInt(5);
				 foundCourse = new Course(course_id,course_name,course_provider,course_duration,course_fees);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundCourse;
	}

	@Override
	public void create(Course courseRef) {
		String sqlQuery="insert into Course_Master values(?,?,?,?,?)";
		try(
			Connection dbConnection = JdbcUtils.buildConnection()
;
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			
		
		int course_id =courseRef.getCourseid();
		String course_name= courseRef.getName();
		String course_provider=courseRef.getProvider();
		int course_duration=courseRef.getDuration();
		int course_fees=courseRef.getFees();
		
		pstmt.setInt(1,course_id);
		pstmt.setString(2,course_name);
		pstmt.setString(3,course_provider);
		pstmt.setInt(4,course_duration);
		pstmt.setInt(5,course_fees);
		int updateCount=pstmt.executeUpdate();
		System.out.println(updateCount+" record inserted");
	}
	catch(Exception ex) {
		ex.printStackTrace();
		
		
	}
	}

	@Override
	public void delete(Integer id) {
		String sqlQuery= "delete from Course_Master where course_id =?";
		try(
			Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int updateCount= pstmt.executeUpdate();
			System.out.println(updateCount+" record delted");
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
			
		}

	@Override
	public void update(Course modifiedcourse) {
		String sqlQuery="update Course_Master set course_name=?, course_provider=?,course_duration=?,course_fees=? where course_id=?";
		int course_id =modifiedcourse.getCourseid();
		String course_name= modifiedcourse.getName();
		String course_provider=modifiedcourse.getProvider();
		int course_duration=modifiedcourse.getDuration();
		int course_fees=modifiedcourse.getFees();
		
		try(
				Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1,course_id);
			pstmt.setString(2,course_name);
			pstmt.setString(3,course_provider);
			pstmt.setInt(4,course_duration);
			pstmt.setInt(5,course_fees);
			int updateCount=pstmt.executeUpdate();
			System.out.println(updateCount+"record updated");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		}


		
	}
		
	
	
		
	


