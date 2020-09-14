package siva02.jse.game;

import java.util.ArrayList;
import java.util.List;

public class MainAppTest {

	public static void main(String[] args) {

		Address address1 = new Address();
		address1.setCity("pinnelli");
		address1.setDoorNo("2-100");
		address1.setPincode(522435);
		address1.setState("AP");
		address1.setStreetName("post office");

		Coach coach = new Coach();
		coach.setName("serma");
		coach.setMobile(8142651855l);
		coach.setAddress(address1);

		Address address2 = new Address();
		address2.setCity("pdrl");
		address2.setDoorNo("9-21/1");
		address2.setPincode(522413);
		address2.setState("AP");
		address2.setStreetName("SR nagar");

		List<Player> playerList = new ArrayList<Player>();
		Player player1 = new Player();

		player1.setId(101);
		player1.setName("siva");
		player1.setAddress(address2);
		playerList.add(player1);

		Address address3 = new Address();
		address3.setCity("palnadu");
		address3.setDoorNo("2-103");
		address3.setPincode(522435);
		address3.setState("AP");
		address3.setStreetName("Sri nagar");

		Player player2 = new Player();
		player2.setId(102);
		player2.setName("kumar");
		player2.setAddress(address3);
		playerList.add(player2);

		Game game = new Game();
		game.setPlayer(playerList);
		game.setCoach(coach);

		Game game_get = game;
		Coach coach_get = game.getCoach();
		List<Player> player_get = game.getPlayer();
		
		System.out.println("*****GAME::(Coach-Player) Details*****");
		System.out.println(coach_get);
		System.out.println(player_get);
	}
}
