package one_to_many.unidirectional.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricket_player_master")

public class CricketPlayer {
	@Id
	@Column(name="Player_id")
	private Integer playerId;
	@Column(name="Player_name")
	private String name;
	@Column(name="Player_age")
	private Integer age;
	
	
	public CricketPlayer() {
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(Integer playerId, String name, Integer age) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.age = age;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CricketPlayer [playerId=" + playerId + ", name=" + name + ", age=" + age + "]";
	}
	

}
