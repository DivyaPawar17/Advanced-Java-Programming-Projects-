package it.education.main;

import it.education.dao.*;
import it.education.entity.Course;
public class DeleteCourseMain {

	public static void main(String[] args) {
		DaoInterface<Course,Integer>daoRef=new CourseDao();
		daoRef.delete(2);
	}
	}


