
public class AppArrays{	
	
	public static int factorial(int nr){
		if(nr == 1) return 1;
		return nr * factorial(nr -1);
	/*
		int res = nr;
		while(nr > 1){
			nr--;
			res = res * nr;
		}
		return res;
		*/
	}
	

	/*
	 * MAIN
	 */
	public static void main(String[] args){
		int nr = Io.readInt("Introduza um numero:");
		System.out.println("Factorial de " + nr + " = " + factorial(nr));
	}
	
	public static void ex1(){
		int [] src = Io.readArray();
		Io.printArray(src, "src = ");
		
		int elem = Io.readInt("Qual o nr a procurar?");
		int idx1 = ArraysUtils.indexOf(src, elem);
		int idx2 = ArraysUtils.binarySearch(src, elem);
		System.out.println("Resultado do indexOf = " + idx1);
		System.out.println("Resultado do binarySearch = " + idx2);
	}
}