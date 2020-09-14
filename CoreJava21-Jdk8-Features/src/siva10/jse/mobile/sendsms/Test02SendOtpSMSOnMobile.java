package siva10.jse.mobile.sendsms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.SplittableRandom;

public class Test02SendOtpSMSOnMobile {

	public static String otpGenerator(int otpLength) {
		SplittableRandom SplittableRandom = new SplittableRandom();
		StringBuilder stringBuilder = new StringBuilder();
		for (int value = 0; value < otpLength; value++) {

			stringBuilder.append(SplittableRandom.nextInt(2, 10));
		}
		return stringBuilder.toString();
	}

	public static void sendSMS(String otpString) {
		try {
			String apiKey = "apiKey=" + "+qPU5QtH2e0-eTX0rZZygyQeMVJ4D9IL8dMhwBXQYx";
			String message = "&message=" + URLEncoder.encode("For Learning Purpose use -->OTP is" + otpString, "UTF-8");
			String numbers = "&numbers=" + "8142651855,9490738517";
			String apiURL = "https://api.textlocal.in/send/?" + apiKey + message + numbers;
			URL url = new URL(apiURL);
			URLConnection urlConnection = url.openConnection();
			urlConnection.setDoOutput(true);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line).append("\n");
			}
			System.out.println(stringBuilder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String otpString = Test02SendOtpSMSOnMobile.otpGenerator(5);
		System.out.println(" Your One Time Passwors is :: " + otpString);
		Test02SendOtpSMSOnMobile.sendSMS(otpString);
	}

}
