package siva04.jse.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class User {

	String userName;
	String password;

	User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}

public class Test4User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter UserName :: ");
		String userName = scanner.nextLine();
		System.out.println("Enter Password :: ");
		String password = scanner.nextLine();
		User user1 = new User(userName, password);
		Predicate<User> predicate = user2 -> user2.userName.equals("siva") && user2.password.equals("annapurna@1993");
		if (predicate.test(user1)) {
			System.out.println("you are valid user....you will get all Services");

		} else {
			System.out.println("you are not valid user...please check username and password");
		}

	}

}
