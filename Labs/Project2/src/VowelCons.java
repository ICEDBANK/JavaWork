
public class VowelCons {
	
	private char vowel[];
	private char constants[];
	private int numVowels = 0;
	private int numCons = 0;
	private String input;
	
public VowelCons(String in){
	
	this.input = in;
	int a = input.length();
	 
	 for (int i = 0; i < a; i++) {
		 
		 char c = input.charAt(i);
		 
		 switch(c){
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u': numVowels++; break;
		 default: numCons++;
		 }

	 }
}


public int getNumVowels() {
	
	return numVowels;
}

public int getNumConsonants() {

	return numCons;
}

}
