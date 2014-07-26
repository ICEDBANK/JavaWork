
public class Name {
	
	// Variables
	
	private String firstName;
	private char mi;
	private String lastName;
	
	// Constructors
	
	public Name(String firstName, char mi, String lastName){
		
		// set new variable to instance.
		
		this.setFirstName(firstName);
		this.setMi(mi);
		this.setLastName(lastName);
		
	}
	
	// Instance Methods 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMi() {
		return mi;
	}

	public void setMi(char mi) {
		this.mi = mi;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName(){
		return firstName + "" + mi + lastName;
	}

}
