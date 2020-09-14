package siva02.jse.game;

public class Coach {
	private String name;
	private long mobile;
	private Address address;

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Coach [name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

}
