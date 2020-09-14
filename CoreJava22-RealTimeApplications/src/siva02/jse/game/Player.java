package siva02.jse.game;

public class Player {
	private String name;
	private int id;
	private Address address;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
