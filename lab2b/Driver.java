/* Name - Irfan Ahmad
 * ID - 20364481
 * Course - CIS-35A
 * Description - This program will display the initial face up side of a coin, and then proceed to
 * toss it 20 times and produce the face up side for each iteration.  After all 20 tosses are complete,
 * the program will state how many of the tosses were heads and how many were tails.
 */

// Creates coin object and initiates a toss by calling Simulation 
public class Driver {

	public static void main(String args[]) {
		
		Coin quarter = new Coin(); // Coin to be tossed 

		Simulation s1 = new Simulation(); // Tossing quarter through Simulation class 
		s1.Toss(quarter);
	}
}
