package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main bethod (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth= 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth= 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage=100;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonsDamage=100;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String input= JOptionPane.showInputDialog("Kick or Yell");
		// 9. If they typed in "yell":
		if(input.equals("yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dragonsDamage = new Random().nextInt(10);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth= dragonHealth - dragonsDamage;
		}
		// 10. If they typed in "kick":
		if(input.equals("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragonsDamage= new Random().nextInt(25);
			//-- Subtract that number from the dragon's health variable
			dragonHealth= dragonHealth-dragonsDamage;
		}
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerDamage= new Random().nextInt(35);
		// 12. Subtract this number from the player's health
		playerHealth= playerHealth- playerDamage;
		
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth<= 0) {
			//-- Tell the user that they lost
			JOptionPane.showConfirmDialog(null, "You Lost");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragonHealth<=0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		
		JOptionPane.showConfirmDialog(null, "The dragon is Dead and You took a ton of Gold");
	   //  15.  Else
		} else { 
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		JOptionPane.showMessageDialog(null, "playerHealth" + playerHealth) ; }	
		}
	}
}
