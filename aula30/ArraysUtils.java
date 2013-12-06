import java.util.Scanner;

public class ArraysUtils{

	/*
	 * Apresentar os elementos do array arr recebido por parametro
	 */
	static void printArray(int [] arr){
		System.out.print("arr = {");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("}");
	}

	public static void main(String[] args)
	{	
		/*
		 * Ler o array introduzido pelo utilizador.
		 */
		Scanner cin = new Scanner(System.in);
		System.out.println("Qual a dimensao do array? ");
		int size = cin.nextInt();
		int [] src = new int[size];
		System.out.println("Introduza os vaores inteiros do array:");
		for(int i = 0; i < size; i++){
			src[i] = cin.nextInt();
		}
		printArray(src);
		/*
		 * Criar um novo array res, que contem os elementos do array src ordenados
		 */
		int [] res = new int [size]; // new int[src.length];
		for(int i = 0; i < res.length; i++){
			int idxMin = 0;
			for(int j = 1; j < src.length; j++){
				if(src[j] < src[idxMin]){
					idxMin = j;
				}
			}
			res[i] = src[idxMin];
			src[idxMin] = Integer.MAX_VALUE;
		}
		printArray(res);
	}
}