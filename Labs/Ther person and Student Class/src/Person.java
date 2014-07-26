
public class Person {
	
	// Variables
	
	private Name name;
	
	// Default Constructor 
	
	public Person(Name name){
		this.name = name;
	}
	
	// Instance Methods
	
	public Name geName(){
		return name;
	}
	
	public void setName(Name name){
		this.name = name;
	}
	
	public String toString(){
		return name.getFullName();
	}
	
	public boolean equals(Object object){
		Name otherName = ((Person)object).geName();
			if (name.getFullName().equals(otherName.getFullName())){
				return true;
			}return false;
	}
	
	/** Compare person last name */
	
	public int compareTo(Object object){
		return 0;
	}
}
