package one_to_many.unidirectional.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="cricket_team_master")
public class CricketTeam {
	
	@Id
	@Column(name="team_id",length=4)
	private Integer teamId;
	@Column(name="team_name",length=25)
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="team_code")
	private Set<CricketPlayer>players; 
	
	public CricketTeam() {
		// Initializing set of players
		players=new HashSet<>();
	}

	public CricketTeam(Integer teamId, String name, Set<CricketPlayer> players) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.players = players;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CricketPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(Set<CricketPlayer> players) {
		this.players = players;
	}
public void setPlayer(CricketPlayer player) {
	//Adding incoming Player into existing set of players
	players.add(player);
}
	@Override
	public String toString() {
		return "CricketTeam [teamId=" + teamId + ", name=" + name + ", players=" + players + "]";
	}
	
	

}
