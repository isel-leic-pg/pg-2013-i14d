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
	 * Join
	 */
	static void join(int [] src1, int [] src2, int[] res){
	
	}
	/*
	 * Sort array in descending order
	 */
	static void sortDesc(int [] src, int[] res){
		for(int i = 0; i < res.length; i++){
			int idxMax = indexOfMaxElem(src);
			res[i] = src[idxMax];
			src[idxMax] = Integer.MIN_VALUE;
		}
	}
	/*
	 * Sort array in ascending order
	 */
	static void sortAsc(int [] src, int[] res){
		for(int i = 0; i < res.length; i++){
			int idxMin = indexOfMinElem(src);
			res[i] = src[idxMin];
			src[idxMin] = Integer.MAX_VALUE;
		}
	}
	static int indexOfMinElem(int [] arr){
		int index = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < arr[index]){
				index = i;
			}
		}
		return index;
	}
	
	static int indexOfMaxElem(int [] arr){
		int index = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[index]){
				index = i;
			}
		}
		return index;
	}

	static int [] cloneArray(int [] a){
		int[] r = new int[a.length];
		for(int i = 0; i < a.length; i++){
			r[i] = a[i];
		}
		return r;
	}

	/*
	 * MAIN
	 */
	public static void main(String[] args)
	{	
		int [] src = readArray();
		printArray(src, "array source");
		/*
		 * Pedir opcao ao utilizador
		 */
		char option;
		do{
			System.out.println("Introduza uma opcao (c) crescente ou (d) decrescente ou (j) join ou (M) maximo ou (m) minimo (s) sair:");
			option = cin.next().charAt(0);
			int [] res = new int[src.length];
			switch(option){
				case 'j':
					int [] otherSrc = readArray();
					res = new int[src.length + otherSrc.length];
					join(src, otherSrc, res);
					printArray(res, "arrays joined");
					break;
				case 'c':
					sortAsc(cloneArray(src), res);
					printArray(res, "array sorted");
					break;
				case 'd':
					int [] copy = cloneArray(src);
					sortDesc(copy, res);
					printArray(res, "array sorted");
					break;
				case 'm':
					int idx = indexOfMinElem(src);
					System.out.println("O menor elemento = " + src[idx]);
					break;
				case 'M':
					idx = indexOfMaxElem(src);
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