package app;

import javax.swing.JOptionPane;

public class View {

	private Palindrome pal;

	public View(Palindrome pal) {
		this.pal = pal;
		this.getInput();
	}

	public void getInput() {
		String text = JOptionPane.showInputDialog("Insert text");
		this.showOutput(text);
	}

	public void showOutput(String text) {
		
		JOptionPane.showMessageDialog(null, this.pal.checkIfPalindrome(text));
	}
}