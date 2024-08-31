package it.education.main;
import it.education.dao.*;
import it.education.entity.Course;


public class RetriveOneMain {

	public static void main(String[] args) {
		DaoInterface<Course,Integer> daoRef=new CourseDao();
		Course courseRef=daoRef.retriveOne(4);
		if(courseRef !=null)
		{
			System.out.println(courseRef);
		}
		else
		{
			System.out.println("Customer with given ID does not exists");
		}
	}
	}


