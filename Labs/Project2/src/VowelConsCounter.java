
import java.util.Scanner; 
public class VowelConsCounter 
{ 
public static void main(String[] args) 
{ 
String input; // User input
char selection; // Menu selection 
// Create a Scanner object for keyboard input. 
Scanner keyboard = new Scanner(System.in); 
// Get the string to start out with. 
System.out.print("Enter a string: "); 
input = keyboard.nextLine(); 
// Create a VowelCons object. 
VowelCons vc = new VowelCons(input); 
do 
{ 
// Display the menu and get the user's selection. 
selection = getMenuSelection(); 
// Act on the selection. 
switch(Character.toLowerCase(selection)) 
{ 
case 'a' : System.out.println("\nNumber of vowels: " + vc.getNumVowels()); 
break; 
case 'b' : System.out.println("\nNumber of consonats: " + vc.getNumConsonants()); 
break; 
case 'c' : System.out.println("\nNumber of vowels: " + vc.getNumVowels()); 
System.out.println("Number of consonants: " + vc.getNumConsonants()); 
break; 
case 'd' : System.out.print("Enter a string: "); 
input = keyboard.nextLine(); 
vc = new VowelCons(input); 
} 
} while (Character.toLowerCase(selection) != 'e'); 
} //end of main
/**
The getMenuSeletion method displays the menu and 
gets the user's choice. 
@return The user's choice. 
*/
public static char getMenuSelection() 
{ 
String input; // To hold keyboard input 
char selection; // The user's selection 
// Create a Scanner object for keyboard input. 
Scanner keyboard = new Scanner(System.in); 
// Display the menu. 
System.out.println("a) Count the number of vowels in the string."); 
System.out.println("b) Count the number of consonats in the string."); 
System.out.println("c) Count both the vowels and consonants in the string."); 
System.out.println("d) Enter another string."); 
System.out.println("e) Exit the program."); 
// Get the user's selection. 
input = keyboard.nextLine(); 
selection = input.charAt(0); 
// Validate the input. 
while (Character.toLowerCase(selection) < 'a' || Character.toLowerCase(selection) > 'e') 
{ 
System.out.print("Only enter a, b, c, d, or e: "); 
input = keyboard.nextLine(); 
selection = input.charAt(0); 
}
return selection; 
} //end getMenuSelection
}