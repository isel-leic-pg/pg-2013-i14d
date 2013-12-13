import java.util.Scanner;

class CharOccurrences{
	int occurrences; 
	char lineChar;
}

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
			if(ArraysUtils.contains(charsOccurrences, c) == false){
				charsOccurrences[idx] = new CharOccurrences();
				charsOccurrences[idx].lineChar = c;
				charsOccurrences[idx].occurrences = ArraysUtils.occurrences(lineChars, c);
				idx++;
			}
		}		
		/*
		 * Apresenta o histograma
		 */
		for(int i = 0; i < charsOccurrences.length; i++){
			if(charsOccurrences[i] != null && charsOccurrences[i].occurrences != 0){
				System.out.print(charsOccurrences[i].lineChar + " ");
				Io.printChar(charsOccurrences[i].occurrences, '*');
			}
		}
	}

	public static void menuIntArrays(){
		int size = Io.readInt("Introduza a capacidade do array:");
		int max = Io.readInt("Introduza o valor maximo dos elementos do array:");
		int [] src = ArraysUtils.newRandArray(size, max);
		Io.printArray(src, "array source");
		/*
		 * Pedir opcao ao utilizador
		 */
		char option;
		do{
			option = Io.readChar("Introduza uma opcao (c) crescente ou (d) decrescente ou (j) join ou (M) maximo ou (m) minimo ou (o) ocorrencias (s) sair:");
			int [] res = new int[src.length];
			switch(option){
				case 'o':
					int nr = Io.readInt("Qual o numero a procurar:");
					int occur = ArraysUtils.occurrences(src, nr);
					System.out.println("Existem " + occur + " ocorrencias do numero "  + nr);
					break;
				case 'j':
					int [] otherSrc = Io.readArray();
					res = new int[src.length + otherSrc.length];
					ArraysUtils.join(src, otherSrc, res);
					Io.printArray(res, "arrays joined");
					break;
				case 'c':
					ArraysUtils.sortAsc(ArraysUtils.cloneArray(src), res);
					Io.printArray(res, "array sorted");
					break;
				case 'd':
					int [] copy = ArraysUtils.cloneArray(src);
					ArraysUtils.sortDesc(copy, res);
					Io.printArray(res, "array sorted");
					break;
				case 'm':
					int idx = ArraysUtils.indexOfMinElem(src);
					System.out.println("O menor elemento = " + src[idx]);
					break;
				case 'M':
					idx = ArraysUtils.indexOfMaxElem(src);
					System.out.println("O maior elemento = " + src[idx]);
					break;
				case 's':
					break;
				default:
					System.out.println("Illegal option");
					break;
			}
		}while(option != 's');

	}
}