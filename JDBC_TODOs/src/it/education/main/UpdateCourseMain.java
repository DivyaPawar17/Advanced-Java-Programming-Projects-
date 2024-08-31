package it.education.main;
import it.education.dao.*;
import it.education.entity.Course;
public class UpdateCourseMain {

	public static void main(String[] args) {
		DaoInterface<Course,Integer>daoRef=new CourseDao();
		Course courseRef= daoRef.retriveOne(3);
		courseRef.setName("CSS");
		courseRef.setProvider("W3");
		courseRef.setDuration(10);
		courseRef.setFees(9000);
	
		
		daoRef.update(courseRef);

	}

}
