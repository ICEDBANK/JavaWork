import java.util.Scanner;

public class VowelsAndConsonantsTest {


	public static void printMenu() {
		
		
	System.out.println("Please select an option: ");
	System.out.println();
	System.out.print("a. Count the number of vowels in the string.\n"
	+ "b. Count the number of consonants in the string.\n"
	+ "c. Count both the vowels and consonants in the string.\n"
	+ "d. Enter another string.\n"
	+ "e. Exit the program\n");
	}
	public static void main(String[] args) {
	String input; // to hold the user's input
	String option; // to hold the user's input
	char choice; // to hold a single character
	char exit; // user chooses 'e' to exit the program
	char letter; //the Y or N from the user's decision to exit
	// create a Scanner object to read keyboard input.
	// Scanner keyboard = new Scanner(System.in);
	Scanner keyboard;
	do {
	keyboard = new Scanner(System.in);
	// ask user to enter string
	System.out.print("Enter a string: ");
	input = keyboard.nextLine();
	input = input.toLowerCase();
	System.out.println();
	printMenu();
	option = keyboard.nextLine();
	choice = option.charAt(0);
	VowelsAndConsonants words = new VowelsAndConsonants(input);
	switch (choice) {
	case 'a':
	case 'A':
	System.out.println("Number of Vowels: " + words.getVowels());
	break;
	case 'b':
	case 'B':
	System.out.println("Number of Consonants: " + words.getConsonants());
	break;
	case 'c':
	case 'C':
	System.out.println("Number of Vowels & Consonants: " + words.getConsonants()
	+ words.getVowels());
	break;
	case 'd':
	case 'D':
	System.out.println("Enter a string: ");
	break;
	case 'e':
	case 'E':
	System.exit(0);
	break;
	default:
	System.out.println("You did not enter a valid choice.");
	}
	//
	// keyboard.nextLine(); //consumes the new line character after the choice
	// String answer = keyboard.nextLine();
	// letter = answer.charAt(0);
	} while (true);
	}
	}