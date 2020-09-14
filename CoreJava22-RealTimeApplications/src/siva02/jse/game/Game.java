package siva02.jse.game;

import java.util.List;

public class Game {
	private Coach coach;
	private List<Player> player;

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Game [coach=" + coach + ", player=" + player + "]";
	}

}
