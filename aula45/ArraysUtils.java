public class ArraysUtils{
	
	/*
	 * Retorna o índice do elemento de arr igual a elem.
	 * Retorna um número negativo caso não exista nenhum 
	 * elemento em arr igual a elem.
	 * NOTA: admitindo que não existem elementos repetidos no array.
	 */
	public static int indexOf(int [] arr, int elem){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == elem){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int [] arr, int elem){
		int limInf = 0;
		int limSup = arr.length -1;
		while(limInf != limSup){
			int idx = (limSup + limInf)/2;
			if(arr[idx] == elem) return idx;
			if(elem > arr[idx]) limInf = idx + 1;
			else limSup = idx - 1;
		}
		return arr[limInf] == elem ? limInf : -1;
	}
}