package entertainment.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entertainment.entity.Movie;
public class RecordInsertionExampleMain {

	public static void main(String[] args) {
		//step1
		Configuration hibernateConfig=new Configuration();
		
		hibernateConfig=hibernateConfig.configure("myConfig.xml");
		
		//step2
		SessionFactory hibernateFactory=hibernateConfig.buildSessionFactory();
		
		//step3
		Session hibernateSession=hibernateFactory.openSession();
		
		//step4
		
		Movie movieObj = new Movie(103,"Dhamaka","Comedy",2018);
		
		//step5
		Transaction hibenateTransaction=hibernateSession.beginTransaction();

		//step6
		hibernateSession.persist(movieObj);
		
		//step7
		hibenateTransaction.commit();
		
		//step8
		hibernateSession.close();
		
		//step9
		hibernateFactory.close();
		
		System.out.println("Record inserted...");
		
	}

}
