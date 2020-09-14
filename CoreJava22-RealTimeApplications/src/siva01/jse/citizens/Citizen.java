package siva01.jse.citizens;

import java.util.List;

public class Citizen {
	
	private AadharCard aadharCard;
	private List<Address> address;
	private PanCard panCard;
	private Passport passport;
	private VoterCard voterCard;

	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(AadharCard aadharCard, List<Address> address, PanCard panCard, Passport passport,
			VoterCard voterCard) {
		super();
		this.aadharCard = aadharCard;
		this.address = address;
		this.panCard = panCard;
		this.passport = passport;
		this.voterCard = voterCard;
	}

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public VoterCard getVoterCard() {
		return voterCard;
	}

	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}

	@Override
	public String toString() {
		return "Citizen [aadharCard=" + aadharCard + ", address=" + address + ", panCard=" + panCard + ", passport="
				+ passport + ", voterCard=" + voterCard + "]";
	}

}
