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

	public boolean LastName(String lastName) {
		regex = "[a-z]{2,}[A-Z]{1}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return m.matches();
	}

	public boolean Email(String email) {
		regex = "^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public boolean MobileNum(String mobile) {
		regex = "^[1-9]{2} [1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobile);
		return m.matches();
	}

	public boolean PasswordAtleastOneSpecialChar(String pass) {
		regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass);
		return m.matches();
	}

}
