package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int random = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println(random);
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog("enter something awesome");
		// 5. If the random number is 0
		if (input.equals("0")) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "that was awesome");
			// 6. If the random number is 1
		}
		if (input.equals("1")) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "thats okay");
			// 7. If the random number is 2
		}
		if (input.equals("2")) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "thats boring");
			// 8. If the random number is 3
		}
		if (input.equals("3")) {
			// -- write your own answer
			JOptionPane.showConfirmDialog(null, "thats Fantastic");
		}
	}
}
