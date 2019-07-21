import java.util.Scanner; // Scanner Library

/* Name - Irfan Ahmad
 * Course - CIS-35A
 * Description - This program will take 3 sets of input for someone's name, age, address, and phone number.
 * It will use constructors and setters to store information for each person, and at the end 
 * call upon the getters to return each person's personal information.
 */

// Driver class will create three instances and call upon PersonalInformation, afterwards it will output all entered information 
public class Driver {
	
	private static Scanner a1 = new Scanner(System.in); // Scanner for user input 
	
	
	public static void main(String [] args) {
		
		
		PersonalInformation instance1 = new PersonalInformation(); //Three separate instances, each instances being tied to PersonalInformation and it's variables 
		PersonalInformation instance2 = new PersonalInformation();
		PersonalInformation instance3 = new PersonalInformation();
		
		System.out.printf("What is the name? "); //Receiving user input for instance 1
		instance1.setName(a1.nextLine());        // Using setters from PersonalInformation 
		
		System.out.printf("What is the age? ");
		instance1.setAge(a1.nextLine());
		
		System.out.printf("What is the address? ");
		instance1.setAddress(a1.nextLine());
		
		System.out.printf("What is the phone number? ");
		instance1.setPhoneNumber(a1.nextLine());
		
		System.out.printf("\nWhat is the name? ");  //Receiving user input for instance 2
		instance2.setName(a1.nextLine());           // Using setters from PersonalInformation 
		
		System.out.printf("What is the age? ");
		instance2.setAge(a1.nextLine());
		
		System.out.printf("What is the address? ");
		instance2.setAddress(a1.nextLine());
		
		System.out.printf("What is the phone number? ");
		instance2.setPhoneNumber(a1.nextLine());
		
		System.out.printf("\nWhat is the name? ");   //Receiving user input for instance 3
		instance3.setName(a1.nextLine());            // Using setters from PersonalInformation 
		
		System.out.printf("What is the age? ");
		instance3.setAge(a1.nextLine());
		
		System.out.printf("What is the address? ");
		instance3.setAddress(a1.nextLine());
		
		System.out.printf("What is the phone number? ");
		instance3.setPhoneNumber(a1.nextLine());
		
		
		System.out.printf("\nPerson #1 Information: "); // Outputting Person 1's information from getters 
		System.out.printf("\nName: " + instance1.getName());
		System.out.printf("\nAge: " + instance1.getAge());
		System.out.printf("\nAddress: " + instance1.getAddress());
		System.out.printf("\nPhone Number: " + instance1.getPhoneNumber());
		
		System.out.printf("\n\nPerson #2 Information: ");  // Outputting Person 2's information from getters 
		System.out.printf("\nName: " + instance2.getName());
		System.out.printf("\nAge: " + instance2.getAge());
		System.out.printf("\nAddress: " + instance2.getAddress());
		System.out.printf("\nPhone Number: " + instance2.getPhoneNumber());
		
		System.out.printf("\n\nPerson #3 Information: ");  // Outputting Person 3's information from getters 
		System.out.printf("\nName: " + instance3.getName());
		System.out.printf("\nAge: " + instance3.getAge());
		System.out.printf("\nAddress: " + instance3.getAddress());
		System.out.printf("\nPhone Number: " + instance3.getPhoneNumber());	

	}
}


