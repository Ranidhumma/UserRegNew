package com.java1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.InvalidException;
import com.java.UserRegistration;

public class UserRegistrationJunit {
	UserRegistration j = new UserRegistration();

	/*
	 * this Test case is used to check our first name passes given regex pattern
	 * 
	 * @throws InputInvalidException - throw the custom exception
	 */

	@Test
	public void testOfFirstName() throws InvalidException {

		boolean result = j.testFirstName("Rani");

		// assertEquals(true, result);

	}

	/* this Test case is used to check our last name passes given regex pattern */
	@Test
	public void testLastName() throws InvalidException {

		boolean result = j.LastName("dhummA");
		assertEquals(true, result);
	}

	/* this Test case is used to check our email passes given regex pattern */
	@Test
	public void testEmail() throws InvalidException {

		boolean result = j.Email("xyz.abc@bl.co.in");
		assertEquals(true, result);
	}

	/*
	 * this Test case is used to check our MobileNumber passes given regex pattern
	 */

	@Test
	public void testMobileNum() throws InvalidException {

		boolean result = j.MobileNum("91 9922554488");
		assertEquals(true, result);
	}

	/*
	 * this Test case is used to check our minimum 8 character password passes given
	 * regex pattern /* Test case used to test atleast one Special char
	 */
	@Test
	public void testPassword() throws InvalidException {

		boolean result = j.PasswordAtleastOneSpecialChar("xyx@123A");
		assertEquals(true, result);
	}

}
