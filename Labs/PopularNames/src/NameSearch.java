import java.util.*;
import java.io.*;

public class NameSearch
{
public static void main(String[] args) throws IOException
{
String input;
char selection;
Scanner keyboard = new Scanner(System.in);
PopularNames names = new PopularNames("names.txt");
do
{
System.out.print("Enter a name to search for: ");
input = keyboard.nextLine().toUpperCase();
names.search(input);
selection = getChoice();
} while (Character.toLowerCase(selection) != 'n');
}
public static char getChoice()
{
String input;
char selection;
Scanner keyboard = new Scanner(System.in);
System.out.print("Do you want to search again (y/n): ");
input = keyboard.next();
selection = input.charAt(0);
return selection;
}
}
