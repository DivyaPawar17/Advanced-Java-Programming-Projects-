package it.education.main;
import it.education.dao.*;
import it.education.entity.Course;


public class CreateNewCourseMain {

	public static void main(String[] args) {
		DaoInterface<Course,Integer>daoRef=new CourseDao();
		Course courseobj= new Course(6,"Spring","javat",3,5000);
		daoRef.create(courseobj);

	}

}
