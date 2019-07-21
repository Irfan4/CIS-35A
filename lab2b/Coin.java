
import java.util.Random; // Random library

/* Name - Irfan Ahmad
 * ID - 20364481
 * Course - CIS-35A
 * Description - This program will display the initial face up side of a coin, and then proceed to
 * toss it 20 times and produce the face up side for each iteration.  After all 20 tosses are complete,
 * the program will state how many of the tosses were heads and how many were tails.
 */


// Coin class, sets up random coin flip and sets output to choose from heads and tails 
public class Coin {

	private String sideUp;
	
	public Coin() { // Calls toss method
		Toss();
	}
	
	public void Toss() { // Sets up random value and assigns head and tails outcomes to it 
		
		Random random = new Random();
		int randomNumber;
		
		randomNumber = random.nextInt(2); // Possible values are 0 and 1 
		
		if (randomNumber == 1) {
			sideUp= "Heads";
		}
		else {
			sideUp = "Tails";
		}
		
	}
	
	public String getSideUp() { // Returns side facing up as outcome of toss 
		return sideUp;
	}
		
	
}
