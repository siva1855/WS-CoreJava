package siva01.jse.citizens;

public class AadharCard {

	private String Name;
	private long uidNo;

	public AadharCard() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getUidNo() {
		return uidNo;
	}

	public void setUidNo(long uidNo) {
		this.uidNo = uidNo;
	}

	@Override
	public String toString() {
		return "AadharCard [Name=" + Name + ", uidNo=" + uidNo + "]";
	}

}
