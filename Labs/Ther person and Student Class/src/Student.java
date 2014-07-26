
public class Student extends Person implements Comparable, Cloneable{

	// Variables
	
	private String major;
	
	//Constructors
	
	public Student(Name name){
		
		super(name);
		major = "Computer Science";
	}
	
	//Default Constructor
	
	
	
	//Instance Method
	
	public String getMajor(){
		return major;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public String toString(){
		
		Name name = this.geName();
		return name.getFullName() + '\n' + "Major:" + major;
		
			if ((name.getFullName().equal(otherName.getLastName()))
					&& (major.equals(((Student)object).getMajor()))){
				return true;
			}
			return false;
			}

	/** Compare student's major, then last name */
		
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
