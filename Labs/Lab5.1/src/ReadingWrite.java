import java.util.Scanner;
import java.util.Random;


public class ReadingWrite {

	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random(3);
		Object array[] = new Object [100];
		for (int counter = 0; counter <= 100; counter++){
			int random = rand.nextInt(100);
			System.out.println(random);
			array[counter] = random;
			
		}
		
		
	}
	
}