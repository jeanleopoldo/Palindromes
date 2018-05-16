package app;

public class Palindrome {

	public Palindrome() {

	}

	public void run() {

		String text = "socorram me subi no onibus em marrocos";
		String treatedText = treatInvalidCharactere(text);
		System.out.println(checkIfPalindrome(treatedText));
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

	public String treatInvalidCharactere(String txt) {
		String treated = txt;
		System.out.println(treated);

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

		System.out.println(treated);
		return treated;
	}

}
