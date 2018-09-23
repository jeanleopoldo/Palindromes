package app;

public class Palindrome {

	public Palindrome() {
		new View(this);
	}

	public boolean checkIfPalindrome(String text) {

		String treatedText = this.treatInvalidCharactere(text);
		treatedText.toLowerCase();
		
		char[] letters = getLetters(treatedText);
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

	private char[] getBackwards(char[] letters) {

		char[] lettersBackwards = new char[letters.length];
		int j = letters.length - 1;

		for (int i = 0; i < letters.length; i++) {
			lettersBackwards[j] = letters[i];
			j--;
		}

		return lettersBackwards;
	}

	private String treatInvalidCharactere(String txt) {
		
		String treated = txt;

		treated = treated.replace("!", "");
		treated = treated.replace("?", "");
		treated = treated.replace(" ", "");
		treated = treated.replace(",", "");
		treated = treated.replace(".", "");
		treated = treated.replace(":", "");
		treated = treated.replace(";", "");
		treated = treated.replace("-", "");
		treated = treated.replace("=", "");
		treated = treated.replace("'", "");
		treated = treated.replace("[", "");
		treated = treated.replace("]", "");
		treated = treated.replace("{", "");
		treated = treated.replace("}", "");

		return treated;
	}
}
