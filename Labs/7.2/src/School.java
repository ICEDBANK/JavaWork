
public class School {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new School();

	}
	public School(){
		Student[] s = new Student[3];
		s[0] = new Student(new Name("Derek", 'S' , "Dexony"));
		s[1] = new Student( new Name("Stacy", 'M', "Waters"));
		s[2] = new Student(new Name("Adamo",'U',"Leetmz"));
		
		String[]str = {"Orange","Jackblade", "Apple"};
		Integer[] i = {new Integer(5), new Integer(0), new Integer(3)};
		
		printList(s);
		System.out.println();
		
		System.out.println("Max is " + max(s));
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

}
