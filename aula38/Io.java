import java.util.Scanner;

public class Io{

	static Scanner cin = new Scanner(System.in);

	/*
	 * Ler um inteiro introduzido pelo utilizador.
	 */
	static int readInt(String msg){
		System.out.println(msg);
		int r = cin.nextInt();
		return r;
	}

	/*
	 * Ler um caracter introduzido pelo utilizador.
	 */
	static char readChar(String msg){
		System.out.println(msg);
		char r = cin.next().charAt(0);
		return r;
	}
	
	/*
	 * Ler o array introduzido pelo utilizador.
	 */
	static int[] readArray(){
		int size = readInt("Qual a dimensao do array? ");
		int [] arr = new int[size];
		System.out.println("Introduza os vaores inteiros do array:");
		for(int i = 0; i < size; i++){
			arr[i] = cin.nextInt();
		}
		return arr;
	}
	/*
	 * Apresentar os elementos do array arr recebido por parametro
	 */
	static void printArray(int [] arr, String label){
		System.out.print(label + " = {");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length - 1)
				System.out.print("| ");
		}
		System.out.println("}");
	}
	
	/*
	 * Apresentar n vezes o character
	 */
	static void printChar(int n, char c){
		for(int i = 0; i < n; i++){
			System.out.print(c);
		}
		System.out.println();
	}
}