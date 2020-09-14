package siva01.jse.citizens;

public class VoterCard {
	private String epicNo;
	private char gender;
	private int age;

	public VoterCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEpicNo() {
		return epicNo;
	}

	public void setEpicNo(String epicNo) {
		this.epicNo = epicNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "VoteCard [epicNo=" + epicNo + ", gender=" + gender + ", age=" + age + "]";
	}

}
