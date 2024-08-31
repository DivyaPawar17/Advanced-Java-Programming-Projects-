package it.education.main;

import java.util.Collection;

import it.education.dao.DaoInterface;
import it.education.entity.Course;
import it.education.dao.*;

public class SimpleSelectQueryretriveallmain {

	public static void main(String[] args) {
		DaoInterface<Course, Integer> daoRef=new CourseDao();
		Collection<Course>allCourses=daoRef.retrieveAll();
		for(Course cust :allCourses ) {
			System.out.println(cust);
		}
	}

}
