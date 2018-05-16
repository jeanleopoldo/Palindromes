package app;

public class Palindrome {

	Text text_;

	public Palindrome() {
		this.text_ = new Text();
	}

	public void run() {

		String text = "socorrammesubinoonibusemmarrocos";
		//System.out.println(treatInvalidCharactere(text));
		System.out.println(checkIfPalindrome(text));
	}

	private boolean checkIfPalindrome(String text) {

		// String treated = treatInvalidCharactere(text);
		char[] letters = getLetters(text);
		char[] backwards = getBackwards(letters);

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] != backwards[i]) {
				return false;
			}
		}

		return true;
	}

	private char[] getLetters(String text) {
		char[] letters = new char[text.length()];

		for (int i = 0; i < letters.length; i++) {
			letters[i] = text.charAt(i);

		}

		return letters;
	}

	public char[] getBackwards(char[] letters) {

		char[] lettersBackwards = new char[letters.length];
		int j = letters.length - 1;

		for (int i = 0; i < letters.length; i++) {
			lettersBackwards[j] = letters[i];
			j--;
		}

		return lettersBackwards;
	}

	public boolean treatInvalidCharactere(String txt) {

		String teste = "mesu";
		String t = "";
	
		return false;
	}

}
