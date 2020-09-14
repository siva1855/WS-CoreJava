package siva01.jse.citizens;

import java.util.ArrayList;
import java.util.List;

public class MainAppTest {

	public static void main(String[] args) {

		AadharCard aadharCard = new AadharCard();
		aadharCard.setName("sivakumar");
		aadharCard.setUidNo(638544460572l);

		List<Address> list = new ArrayList<Address>();
		Address address1 = new Address();

		address1.setDistrict("guntur");
		address1.setStreetName("sri nagar");
		address1.setVillage("pinnelli");
		address1.setDoorNo("9-21");
		address1.setMandal("machavaram");
		address1.setPincode(522435);
		address1.setState("AP");

		list.add(address1);

		Address address2 = new Address();
		address2.setDistrict("guntur");
		address2.setStreetName("main road");
		address2.setDoorNo("9-21/1");
		address2.setVillage("krosuru");
		address2.setMandal("krosuru");
		address2.setPincode(522413);
		address2.setState("AP");

		list.add(address2);

		PanCard panCard = new PanCard();
		panCard.setDOB("09/02/1993");
		panCard.setPancardNo("EDF4526D");

		Passport passport = new Passport();
		passport.setCountry("india");
		passport.setPassportNo(456136554);
		passport.setVisaNo(452564);

		VoterCard voterCard = new VoterCard();
		voterCard.setAge(26);
		voterCard.setEpicNo("SSSG452G");
		voterCard.setGender('M');

		Citizen citizen_set = new Citizen();
		citizen_set.setAadharCard(aadharCard);
		citizen_set.setPanCard(panCard);
		citizen_set.setAddress(list);
		citizen_set.setPassport(passport);
		citizen_set.setVoterCard(voterCard);

		Citizen citizen_get = citizen_set;

		AadharCard aadhar_get = citizen_set.getAadharCard();
		List<Address> list_get = citizen_set.getAddress();
		PanCard pancard_get = citizen_set.getPanCard();
		Passport passport_get = citizen_set.getPassport();
		VoterCard voter_get = citizen_set.getVoterCard();

		System.out.println("*****Citizen Details*****");
		
		System.out.println(aadhar_get);
		System.out.println("...................");
		System.out.println(list_get);
		System.out.println("....................");

		System.out.println(pancard_get);
		System.out.println("......................");

		System.out.println(passport_get);
		System.out.println(".........................");

		System.out.println(voter_get);

	}
}
