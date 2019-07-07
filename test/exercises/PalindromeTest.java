package exercises;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}

	@Test
	void wordExist() throws Exception {
		assertTrue(testPalindrome.wordExist("superconception"));
	}

	@Test
	void wordIsAPalindrome() throws Exception {
		assertTrue(testPalindrome.wordIsAPalindrome("kayak"));
		assertFalse(testPalindrome.wordIsAPalindrome("Zapoteco"));
	}


}
