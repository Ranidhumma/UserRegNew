package com.java1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.java.EmailMultiple;

/*  We have created this class to test the multiple email, used Parameterized tests
 *  created a parameterized test and created a public static method @Parameters that returns a Collection of Objects (as Array) as test data set.
 * Here we created a public constructor that takes test data and created an instance variable for each test data*/

@RunWith(Parameterized.class)
public class EmailMultipleTest {
	private String emailids;
	private boolean expectedResult;

	public EmailMultipleTest(String emailIds, boolean expectedResult) {
		this.emailids = emailIds;
		this.expectedResult = expectedResult;

		this.emailids = emailIds;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection mailIdsExpectedResult() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}

	/*
	 * this Test case is used to check all passing ids are matches to regex pattern
	 */

	@Test
	public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
		EmailMultiple ab = new EmailMultiple();
		boolean result = ab.Emailcheck(this.emailids);

		Assert.assertEquals(this.expectedResult, result);
	}
}
