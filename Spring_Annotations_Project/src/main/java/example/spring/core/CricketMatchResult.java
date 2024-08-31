package example.spring.core;

public class CricketMatchResult implements GreetingService {
	private String winningTeam;
	private String losingTeam;
	private int winningMargin;
	private String winningType;
	
	public CricketMatchResult() {
		System.out.println("Inside CricketMatchResult()");
		// TODO Auto-generated constructor stub
	}
	

	public CricketMatchResult(String winingTeam, String losingTeam, int winningMargin, String winningType) {
		System.out.println("Inside CricketMatchResult(String,String,int,String)");
		
		this.winningMargin = winningMargin;
		this.winningTeam = winingTeam;
		this.losingTeam = losingTeam;
		this.winningType = winningType;
	}



	public CricketMatchResult(int winningMargin, String winingTeam, String losingTeam, String winningType) {
		System.out.println("Inside CricketMatchResult(int,String,String,String)");
		this.winningMargin = winningMargin;
		this.winningTeam = winingTeam;
		this.losingTeam = losingTeam;
		this.winningType = winningType;
	}


	
	public String getWinningTeam() {
		return winningTeam;
	}


	public void setWinningTeam(String winningTeam) {
		System.out.println("Setting Winning Team....");
		this.winningTeam = winningTeam;
	}


	public String getLosingTeam() {
		return losingTeam;
	}


	public void setLosingTeam(String losingTeam) {
		this.losingTeam = losingTeam;
	}


	public int getWinningMargin() {
		return winningMargin;
	}


	public void setWinningMargin(int winningMargin) {
		this.winningMargin = winningMargin;
	}


	public String getWinningType() {
		return winningType;
	}


	public void setWinningType(String winningType) {
		this.winningType = winningType;
	}


	@Override
	public String toString() {
		return "CricketMatchResult [ winningTeam=" +  winningTeam + ", losingTeam=" + losingTeam + ", winningMargin="
				+ winningMargin + ", winningType=" + winningType + "]";
	}
	
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String greetingMessage = "Heartiest Congratulations to team " 
		+ winningTeam + " for defeating team " + losingTeam + " by " + winningMargin +" " + winningType;
		return greetingMessage;
	}
}
