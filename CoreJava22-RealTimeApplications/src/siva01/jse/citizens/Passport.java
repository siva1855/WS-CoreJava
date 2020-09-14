package siva01.jse.citizens;

public class Passport {
	private int visaNo;
	private int passportNo;
	private String country;

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVisaNo() {
		return visaNo;
	}

	public void setVisaNo(int visaNo) {
		this.visaNo = visaNo;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [visaNo=" + visaNo + ", passportNo=" + passportNo + ", country=" + country + "]";
	}

}
