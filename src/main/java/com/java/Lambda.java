package com.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We have created lambda function here in this class and we have created a
 * function interface and created one method to check regex
 * 
 * @author Rani
 */

@FunctionalInterface
interface Lambda {
	boolean checkRegex(String data, String name);
}

class LambdaValidation {
	public static Scanner scanner = new Scanner(System.in);
	private static String regexOfFirstName;
	private static String firstName;
	private static String regexOfLastName;
	private static String lastName;
	private static String regexOfEmail;
	private static String email;
	private static String mobile;
	private static String regexOfMobileNum;
	private static String regexOfPasswordAtleastOneSpecialChar;
	private static String pass;

	/*
	 * In below lambda expression we will pass the regex and the input. The regex
	 * will check and give the output
	 */
	public static void main(String[] args) {
		Lambda validation = (regex, input) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			return matcher.matches();
		};

		/*
		 * we created one method called checkRegex to check the first name
		 */

		regexOfFirstName = "^[A-Z]{1}[a-z]{2,}$";
		System.out
				.println("Enter your FirstName\n" + "First Letter Will be UpperCase\n" + "Should Minimum 3 Characters");
		firstName = scanner.next();
		if (validation.checkRegex(regexOfFirstName, firstName)) {
			System.out.println("FirstName is Valid");
		} else {
			System.out.println("FirstName is Invalid");
		}

		/*
		 * we created one method called checkRegex to check the Last name
		 */
		regexOfLastName = "^[A-Z]{1}[a-z]{2,}$";
		System.out
				.println("Enter your LastName\n" + "First Letter Will be UpperCase\n" + "should Minimum 3 Characters");
		lastName = scanner.next();
		if (validation.checkRegex(regexOfLastName, lastName)) {
			System.out.println("LastName is Valid");
		} else {
			System.out.println("LastName is Invalid");
		}

		/*
		 * we created one method called checkRegex to check the emailid name
		 */
		regexOfEmail = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		System.out.println("Enter your EmailId");
		email = scanner.next();
		if (validation.checkRegex(regexOfEmail, email)) {
			System.out.println("EmailId is Valid");
		} else {
			System.out.println("EmailId is Invalid");
		}

		/*
		 * we created one method called checkRegex to check the mobile number
		 */
		regexOfMobileNum = "^[1-9]{2} [1-9]{1}[0-9]{9}$";

		System.out.println("Enter your MobileNo\n" + "With Country Code");
		mobile = scanner.next();
		if (validation.checkRegex(regexOfMobileNum, mobile)) {
			System.out.println("MobileNo is Valid");
		} else {
			System.out.println("MobileNo is Invalid");
		}

		/*
		 * we created one method called checkRegex to check the Password
		 */
		regexOfPasswordAtleastOneSpecialChar = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8}$";
		System.out.println("Enter your Password\n" + "at least contain One Uppercase, one Numeric, One Special Char\n"
				+ "and minimum 8 field length");
		pass = scanner.next();
		if (validation.checkRegex(regexOfPasswordAtleastOneSpecialChar, pass)) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Invalid");
		}
	}

}
