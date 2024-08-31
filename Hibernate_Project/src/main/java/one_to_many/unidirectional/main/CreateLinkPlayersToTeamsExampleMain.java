package one_to_many.unidirectional.main;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many.unidirectional.entity.CricketPlayer;
import one_to_many.unidirectional.entity.CricketTeam;
import utils.HibernateUtils;

public class CreateLinkPlayersToTeamsExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
				){
			//Load all Players
			Class<CricketPlayer>playerType=CricketPlayer.class;
			CricketPlayer player1=sessionRef.find(playerType, 1);
			CricketPlayer player2=sessionRef.find(playerType, 2);
			CricketPlayer player3=sessionRef.find(playerType, 3);
			CricketPlayer player4=sessionRef.find(playerType, 4);
			CricketPlayer player5=sessionRef.find(playerType, 5);
			CricketPlayer player6=sessionRef.find(playerType, 6);
			
			//Load all Teams
			Class<CricketTeam>teamType=CricketTeam.class;
			CricketTeam team1=sessionRef.find(teamType, 1);
			CricketTeam team2=sessionRef.find(teamType, 2);
			
			//start Transaction
			Transaction tx=sessionRef.beginTransaction();
			//Link to all players
			//populating a set of 3 players: player1,player2,player3
			Set<CricketPlayer> indianPlayers= Set.of(player1,player2,player3);
			team1.setPlayers(indianPlayers);
			
			team2.setPlayer(player4);
			team2.setPlayer(player5);
			team2.setPlayer(player6);
			tx.commit();
			System.out.println("Players linked to Teams");
			
			
			
			
			
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
