package siva01.jse.citizens;

public class PanCard {

	private String pancardNo;
	private String DOB;

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPancardNo() {
		return pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "PanCard [pancardNo=" + pancardNo + ", DOB=" + DOB + "]";
	}

}
