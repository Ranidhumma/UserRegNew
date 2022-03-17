package com.java;

/**
 * this method is used to test Happy or sad case If it is happy it will return
 * Entry Successful and if it is sad it will return Entry Failed
 */
public class EmotionCheck {

	public String analyseEmotion(String emotion) {
		if (emotion.toLowerCase().contains("happy")) {
			return "Entry Successful";
		} else if (emotion.toLowerCase().contains("sad")) {
			return "Entry Failed";
		} else
			return null;
	}
}
