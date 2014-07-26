import java.io.*;

/**
 * The popularNames class reads a list of names from a file into an
 * array. it provides a search method that can be used to search 
 * for a particular name in the array.
 * @author Rice_Desktop
 *
 */

public class PopularNames {
	
	private String[] names;

	public PopularNames(String filename) throws IOException
	{
	FileReader freader = new FileReader(filename);
	BufferedReader inFile = new BufferedReader(freader);
	int lines;

	lines = numLines(filename);
	String[] names = new String[lines];
	}

	public int search(String value)
	{
	int first = 0;
	int last = names.length;
	boolean found = false;
	while (first < last)
	{
	int middle = (first + last) / 2;
	if (value.compareTo(names[middle]) < 0)
	{
	found = true;
	last = middle;
	}
	else if (value.compareTo(names[middle]) > 0)
	{
	found = true;
	first = middle + 1;
	}
	else
	{
	found = true;
	return middle;
	}
	}
	return -1;
	}

	private int numLines(String filename) throws IOException
	{
	FileReader freader = new FileReader(filename);
	BufferedReader inFile = new BufferedReader(freader);
	int count = 0;
	for (count = 0; count < filename.length(); count++)
	{
	names[count] = inFile.readLine();
	}
	inFile.close();
	return count;
	}
	}

