package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String regex;

	public boolean FirstName(String firstName) {
		regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return m.matches();
	}

	public boolean testFirstName(String firstName) {
		try {
			if (!FirstName(firstName)) {
				throw new InvalidException("Invalid firstName");
			} else {
				System.out.println("Valid Input");
			}
		} catch (InvalidException e) {
			System.out.println("exception occured" + e);
		}
		return FirstName(firstName);
	}

	public boolean LastName(String lastName) {
		regex = "[a-z]{2,}[A-Z]{1}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return m.matches();
	}

	public boolean testLastName(String lastName) {
		try {
			if (!LastName(lastName)) {
				throw new InvalidException("Invalid lastName");
			} else {
				System.out.println("Valid Input");
			}
		} catch (InvalidException e) {
			System.out.println("exception occured" + e);
		}
		return LastName(lastName);
	}

	public boolean Email(String email) {
		regex = "^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public boolean testEmail(String email) {
		try {
			if (!Email(email)) {
				throw new InvalidException("Invalid emailID");
			} else {
				System.out.println("Valid Input");
			}
		} catch (InvalidException e) {
			System.out.println("exception occured" + e);
		}
		return Email(email);
	}

	public boolean MobileNum(String mobile) {
		regex = "^[1-9]{2} [1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobile);
		return m.matches();
	}

	public boolean testMobileNum(String firstName) {
		try {
			if (!FirstName(firstName)) {
				throw new InvalidException("Invalid MobileNumber");
			} else {
				System.out.println("Valid Input");
			}
		} catch (InvalidException e) {
			System.out.println("exception occured" + e);
		}
		return FirstName(firstName);
	}

	public boolean PasswordAtleastOneSpecialChar(String pass) {
		regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass);
		return m.matches();
	}

	public boolean testPasswordAtleastOneSpecialChar(String pass) {
		try {
			if (!PasswordAtleastOneSpecialChar(pass)) {
				throw new InvalidException("Invalid Password");
			} else {
				System.out.println("Valid Input");
			}
		} catch (InvalidException e) {
			System.out.println("exception occured" + e);
		}
		return PasswordAtleastOneSpecialChar(pass);
	}
}
