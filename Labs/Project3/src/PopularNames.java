
import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;


public class PopularNames 
{
	private ArrayList  names;

	public PopularNames(String filename) throws IOException 
	{

		FileReader freader = new FileReader(filename);
		BufferedReader inFile = new BufferedReader(freader);


		this.names = new ArrayList<String>();


		String line;
		while ((line = inFile.readLine()) != null)
		{
			names.add(line);
		}


		inFile.close();


		quickSort();
	}


	public int search(String value) 
	{
		int first;
		int last; 
		int middle; 
		int position; 
		boolean found; 
	


		int index = -1;
		for (int i=0; i<names.size(); i++)
		{
			if (((String) names.get(i)).toUpperCase().equals(value.toUpperCase()))
			{
				index = i;
				break;
			}
		}



		return index;
	}


	private int numLines(String filename) throws IOException {

		return 0;
	}
	
	private void quickSort() 
	{
		doQuickSort(names, 0, names.size() - 1);
	}


	private void doQuickSort(List<String> array, int start, int end) {
		int pivotPoint;

		if (start < end) {
			
			pivotPoint = partition(array, start, end);
			
			doQuickSort(array, start, pivotPoint - 1);

			doQuickSort(array, pivotPoint + 1, end);

		}
	}



	private int partition(List<String> array, int start, int end) 
	{
		String pivotValue; 
		int endOfLeftList;
		int mid;

		pivotValue = (String) array.get(start);
		
		Collator coll = Collator.getInstance();
		while (start < end)
		{
			while (coll.compare(array.get(start), pivotValue) < 0) start++;
			while (coll.compare(array.get(end), pivotValue) > 0) end--;
			swap (array, start, end);
		}  


		return start;
	}

	private void swap(List<String> array, int a, int b) 
	{
		String temp = (String) array.get(b);
		array.set(b, array.get(a));
		array.set(a, temp);
	}
}
