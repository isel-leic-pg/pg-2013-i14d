import java.util.Scanner;

public class AppArrays{	

	static Scanner cin = new Scanner(System.in);
	
	/*
	 * MAIN
	 */
	public static void main(String[] args)
	{	
		System.out.println("Introduza uma frase:");
		String line = cin.nextLine();
		char[] lineChars = line.toCharArray();
		CharOccurrences[] charsOccurrences = new CharOccurrences[lineChars.length];
		int idx = 0;
		/*
		 * Calcula  o histograma
		 */
		for(int i = 0; i < lineChars.length; i++){
			char c = lineChars[i];
			CharOccurrences co = null;
			for(int j = 0; j < charsOccurrences.length; j++){
				if(charsOccurrences[j] == null){
					break;
				}
				if(charsOccurrences[j].getChar() == c){
					co = charsOccurrences[j];
					break;
				}
			}
			if(co == null){
				co = new CharOccurrences(c);
				charsOccurrences[idx] = co;
				idx++;
			}
			co.inc();
		}		
		/*
		 * Apresenta o histograma
		 */
		for(int i = 0; i < charsOccurrences.length; i++){
			CharOccurrences co = charsOccurrences[i];
			if(co != null){
				co.print();
			}
		}
	}
}