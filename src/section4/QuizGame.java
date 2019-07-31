package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("what is the capital of spain");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equals("Madrid")) {
		// 4.  if the user's answer was correct, add one to their score 
		score= score + 1;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input2= JOptionPane.showInputDialog("what is the capital of Michigan");
			if(input.equals("Lansing")) {}
			score= score + 1;
			String input3= JOptionPane.showInputDialog("what is the capital of France");
			if(input.equals("Paris")) {
				score=score+1;
			}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showConfirmDialog(null, "Yor score is "+score);}
	}
}
