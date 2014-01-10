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
	 * Ler o array introduzido pelo utilizador.
	 */
	static int[] readArray(){
		int size = readInt("Qual a dimensao do array? ");
		int [] arr = new int[size];
		System.out.println("Introduza os valores inteiros do array:");
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
}