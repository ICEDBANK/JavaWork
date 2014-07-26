
public class School {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	new School();
}
	public School(){
		Student[]s = new Student[3];
		s[0] = new Student(new Name("Derek",'s',"Dexony"));
		s[1] = new Student(new Name("Stacy",'M',"Waters"));
		s[2] = new Student(new Name("Adamo",'U',"Leetmz"));
		
		String[]str = {"orange","Jackblade","Apple"};
		Integer[]i = {new Integer(5),new Integer(0), new Integer(3)};
		
		printList(s);
		System.out.println();
		
		System.out.println("Max is" + max(s));
		System.out.println();
		
		sort(s);
		printList(s);
		System.out.println();
		
		printList(str);
		System.out.println();
		
		System.out.println("Max is" + max(str));
		System.out.println();
		
		sort(str);
		printList(str);
		System.out.println();
		
		printList(i);
		System.out.println();
		
		System.out.println("Max is " + max(i));
		System.out.println();
		
		sort(i);
		printList(i);
	}
public static void printList(Object[]object){
		
	}
public static Object max(Object[] str) {
    Object maximum = str[0]; 
    for (int i=1; i<str.length; i++) {
        
            maximum = str[i];
        }
    
    return maximum;
}
public static  void sort(Object[]object){
	
}
}

