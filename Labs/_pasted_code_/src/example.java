import java.io.*;
public class example {
	public static void main(String[] args){
		
		char[] letters = {'a','b','c','d','e','f'};
		//char[] test = new char[6];
		
		try{
			//Create an output stream to the file
			FileOutputStream output = new FileOutputStream ("MyLetters.txt");
			
			//output values to the file
			for (int i = 0; i<6; i++)
				output.write(letters[i]);
			
			//Close the output stream
			output.close();
			
			System.out.println("The characters read from the file are: " );
			
			//Create an input steam for the file
			FileInputStream input = new FileInputStream("MyLetters.txt");
			
			//Read values from the file
			char value;
			while ((value = (char)input.read()) != -1)
				System.out.print (value + " ");
			
			//Close the input stream
			input.close();
		}
		catch (IOException e)
		{
			System.out.println("Error = " + e.getMessage());
		}
	}

}