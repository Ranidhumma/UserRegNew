package com.java1;

import org.junit.Assert;
import org.junit.Test;

import com.java.EmotionCheck;
/* We have created this method to test the emotion if happy or sad*/

public class EmotionChcekTest {
	EmotionCheck emotion = new EmotionCheck();

	@Test
	public void givenMessage_Happy_ReturnEntrySuccessful() {

		String result = emotion.analyseEmotion("i am Happy");
		Assert.assertEquals("Entry Successful", result);
	}

	@Test
	public void givenMessage_Sad_ReturnEntryFailed() {

		String result = emotion.analyseEmotion("i am Sad");
		Assert.assertEquals("Entry Failed", result);
	}

}
