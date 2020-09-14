package siva10.jse.mobile.sendsms;

import java.util.SplittableRandom;

public class Test01OTPGeneratorOTP {

	public static String otpGenerator(int otpLength) {

		SplittableRandom SplittableRandom = new SplittableRandom();

		StringBuilder stringBuilder = new StringBuilder();

		for (int value = 0; value < otpLength; value++) {
			// here, 2 is starting number include and 10 is the exclude(except)
			stringBuilder.append(SplittableRandom.nextInt(0, 10));
		}

		return stringBuilder.toString();
	}

	public static void main(String[] args) {

		// here, 5 is length of OTP
		String otpString = Test01OTPGeneratorOTP.otpGenerator(5);

		System.out.println(" Your One Time Passwors is :: " + otpString);
	}

}
