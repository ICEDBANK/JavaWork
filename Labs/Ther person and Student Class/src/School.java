import java.lang.Math;
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new School();

	}
	public School(){
		
		//Define the arrays to be tested.
		
		Student[] s = new Student[3];
		
		s[0] = new Student(new Name("Derek ", 'S',"Dexony"));
		s[1] = new Student(new Name("Stacy ", 'M',"Waters"));
		s[2] = new Student(new Name("Adamo ", 'U',"Leetmz"));
		
		String[] str = {"Orange", "Jackblade","Apple"};
		Integer[] i = {new Integer(5), new Integer(0), new Integer(3)};
		
		//Display current array of students
		
		printList(s);
		System.out.println();
		
		//Display max of students
		
		System.out.println("Max is " + max(s));
		System.out.println();
		
		//Display sorted students
		
		sort(s);
		printList(s);
		System.out.println();
		
		//Display current array of strings
		
		printList(str);
		System.out.println();
		
		//Display max of strings
		
		System.out.println("Max is " + max(str));
		System.out.println();
		
		//Display sorted strings
		
		sort(str);
		printList(str);
		System.out.println();
		
		//Display current array of integers
		
		printList(i);
		System.out.println();
		
		//Display max of integers
		
		System.out.println("Max is " + max(i));
		System.out.println();
		
		//Display sorted integers
		
		sort(i);
		printList(i);
		
		/**Print an array of Objects*/
	}
		
public static void printList(Object[] object){
			
		}//End of method printList(Object[])
	
	
public static Object max(Object[] object){
			//Find max of array object
	


			
			//Return results.
		return 0;
			
		}//End of method max (Object[])
		
public static void sort(Object[] object){
			//Set the variable for the current min, minIndex and compare value
	
			
			//Begin loop to work through the list.
	

	 for(int j=0; j<object.length;j++)
	 {
	     for (int i=j+1 ; i<object.length; i++)
	     {
	         if(((String) object[i]).compareTo((String) object[j])<0)
	         {
	             String temp= (String) object[j];
	             object[j]= object[i]; 
	             object[i]=temp;


	         }
	     }

	     System.out.print(object[j]);
	 }
			
			//Swap list[i] with list [currentMaxIndex if needed.
			
		}//End of instance method sort.

}

