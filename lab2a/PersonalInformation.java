
/* Name - Irfan Ahmad
 * ID - 20364481
 * Course - CIS-35A
 * Description - This program will take 3 sets of input for someone's name, age, address, and phone number.
 * It will use constructors and setters to store information for each person, and at the end 
 * call upon the getters to return each person's personal information.
 */


public class PersonalInformation {
	

	private String name; // Variables representing personal information
	private String age;
	private String address;
	private String phoneNumber;
	
	public PersonalInformation () { // Default constructor
		
	}
	
	public PersonalInformation (String name, String age, String address, String phoneNumber) { // Constructor with variables implemented
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
			
	}

	public String getName() { // Returns value
		return name;
	}
	
	public void setName(String name) { // Uses setter to assign value
		this.name = name;
	}
	
	public String getAge() { // Returns value
		return age;
	}
	
	public void setAge(String age) { // Uses setter to assign value
		this.age = age;
	}
	
	public String getAddress() { // Returns value
		return address;
	}
	
	public void setAddress(String address) { // Uses setter to assign value
		this.address = address; 
	}
	
	public String getPhoneNumber() { // Returns value
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) { // Uses setter to assign value
		this.phoneNumber = phoneNumber;
	}
	
}


