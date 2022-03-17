package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMultiple {
	/*
	 * * we areted one class and defined the one regex pattern which matches all id
	 */
	public String regex;

	public boolean Emailcheck(String emailids) {
		regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailids);
		return m.matches();
	}
}
