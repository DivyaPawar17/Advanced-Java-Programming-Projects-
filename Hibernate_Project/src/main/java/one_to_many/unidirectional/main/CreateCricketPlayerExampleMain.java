package one_to_many.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many.unidirectional.entity.CricketPlayer;
import utils.HibernateUtils;

public class CreateCricketPlayerExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
				){
			CricketPlayer player1= new CricketPlayer(1,"Virat Kohli",35);
			CricketPlayer player2= new CricketPlayer(2,"Rohit Sharma",36);
			CricketPlayer player3= new CricketPlayer(3,"Japreet Bumarah",27);
			CricketPlayer player4= new CricketPlayer(4,"Pat Cummins",35);
			CricketPlayer player5= new CricketPlayer(5,"Travis Head",30);
			CricketPlayer player6= new CricketPlayer(6,"Glenn Maxwell",34);
			
			
			Transaction tx= sessionRef.beginTransaction();
			sessionRef.persist(player1);
			sessionRef.persist(player2);
			sessionRef.persist(player3);
			sessionRef.persist(player4);
			sessionRef.persist(player5);
			sessionRef.persist(player6);
			tx.commit();
			System.out.println("Players is created");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
