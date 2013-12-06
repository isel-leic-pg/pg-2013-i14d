import java.util.Scanner;

public class ArraysUtils{

	static Scanner cin = new Scanner(System.in);

	/*
	 * Ler o array introduzido pelo utilizador.
	 */
	static int[] readArray(){
		System.out.println("Qual a dimensao do array? ");
		int size = cin.nextInt();
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
				System.out.print(", ");
		}
		System.out.println("}");
	}
	/*
	 * Sort array in ascending order
	 */
	static void sortAsc(int [] src, int[] res){
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
	}
	/*
	 * Sort array in descending order
	 */
	static void sortDesc(int [] src, int[] res){
		for(int i = 0; i < res.length; i++){
			int idxMax = 0;
			for(int j = 1; j < src.length; j++){
				if(src[j] > src[idxMax]){
					idxMax = j;
				}
			}
			res[i] = src[idxMax];
			src[idxMax] = Integer.MIN_VALUE;
		}
	}
	/*
	 * Join
	 */
	static void join(int [] src1, int [] src2, int[] res){
		for(int i = 0; i < src1.length; i++)
			res[i] = src1[i];
		for(int i = 0; i < src2.length; i++)
			res[i + src1.length] = src2[i];
	}
	/*
	 * MAIN
	 */
	public static void main(String[] args)
	{	
		int[] src = readArray();
		printArray(src, "array source");
		/*
		 * Pedir opcao ao utilizador
		 */
		System.out.println("Introduza uma opcao (c) crescente ou (d) decrescente ou (j) join:");
		char option = cin.next().charAt(0);
		int [] res = new int[src.length];
		if(option == 'c'){			
			sortAsc(src, res);
		} else if(option == 'd'){			
			sortDesc(src, res);
		} else if(option == 'j'){
			int [] otherSrc = readArray();
			res = new int[src.length + otherSrc.length];
			join(src, otherSrc, res);
		} else {
			System.out.println("Illegal option");
		}
		/*
		 * Escrever o resultado
		 */
		printArray(res, "array sorted");
	}
}