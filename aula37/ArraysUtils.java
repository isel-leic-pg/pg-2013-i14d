public class ArraysUtils{

	/*
	 * Retorna o true se o array a tiver um elemento igual a c
	 */
	static boolean contains(char [] a, char c){
		for(int i = 0; i < a.length; i++){
			if(a[i] == c)
				return true;
		}
		return false;
	}
	
	/*
	 * Retorna o numero de ocurrencias de um caracter no array a
	 */
	static int occurrences(char [] a, char c){
		int r = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == c)
				r++;
		}
		return r;
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
	 * Retorna o numero de ocurrencias de nr no array a
	 */
	static int occurrences(int [] a, int nr){
		int r = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == nr)
				r++;
		}
		return r;
	}

	/*
	 * Retorna um novo array de tamanho igual a capacity e
	 * inicializado aleatoriamente com elementos contidos no 
	 * intervalo [0, max]
	 */
	static int[] newRandArray(int capacity, int max){
		int [] r = new int[capacity];
		for(int i = 0; i < r.length; i++){
			r[i] = (int) (Math.random() * (max + 1));
		}
		return r;
	}
}