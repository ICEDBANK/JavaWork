import java.util.Scanner;
import java.io.IOException;


public class NameSearch {
	public static void main(String[] args) throws IOException {
		String input; 
		Scanner keyboard = new Scanner(System.in);

		
		PopularNames names = new PopularNames(
				"C:\\Documents and Settings\\Administrator\\Desktop\\names.txt");

	
		do {

			System.out.println("Please enter a name");
			String value;
			Scanner s=new Scanner(System.in);
			value=s.next();


			int index = names.search(value);


			if (index != -1) {
				System.out.println(String.format("C:\\Documents and Settings\\Administrator\\Desktop\\names.txt contains the name %s",
						value));
			} else {
				System.out.println(String.format(
						"C:\\Documents and Settings\\Administrator\\Desktop\\names.txt DOES NOT contain the name %s", value));
			}
				
		} while (1 == 4);
	}
}
