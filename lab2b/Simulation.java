
/* Name - Irfan Ahmad
 * Course - CIS-35A
 * Description - This program will display the initial face up side of a coin, and then proceed to
 * toss it 20 times and produce the face up side for each iteration.  After all 20 tosses are complete,
 * the program will state how many of the tosses were heads and how many were tails.
 */

// Carries out toss function and loops it 20 times 
public class Simulation {
	
	Coin c = new Coin();
	
	int headCount = 0; // Initializing count of head, tails, and toss so that the total occurrences of each can be outputted 
	int tailCount = 0;
	int tossCount = 0;
	
	public void Toss(Coin c) {
		
		System.out.printf("Initial side facing up: " + c.getSideUp()); // Initial side facing up of coin 

		for (int currentToss = 1; currentToss <= 20; currentToss++) { // Calls upon Toss for 20 toss outcomes, toss count incrementing 
			c.Toss();
			System.out.printf("\nSide facing up: " + c.getSideUp());
			
			tossCount++;
			
			if (c.getSideUp() == "Heads" ) { // If side facing up is heads then headCount increases 
				
				headCount += 1;
			}
			
			else { // If side facing up is tails then tailCount increases 
				tailCount += 1;
			}
				
		}
		
		System.out.printf("\nOut of the " + tossCount + " tosses, ");             // Displays number of tosses 
		System.out.printf(headCount + " were heads and " + tailCount + " were tails.");      // Displays number of times heads and tails faced up 
	}
	
	

}
