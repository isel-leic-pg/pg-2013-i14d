import java.util.Calendar;
import java.io.InputStream;
import java.util.Scanner;

class AppDivs{

	static Scanner cin = new Scanner(System.in);

	/*
	 */
	static void exemplo1(){
		System.out.println("Introduza um valor inteiro:");
		int n1 = cin.nextInt();
		System.out.println("Introduza outro valor inteiro:");
		int n2 = cin.nextInt();
		
		double res1 = n1 / n2;
		/*
		 * 1) converte n1 para real, por causa causa do operador de casting (double)
		 * 2) converte n2 para real, para que os OPERANDOS sejam do mesmo tipo.
		 */
		double res2 = (double) n1 / n2;
		double res3 = (double) (n1 / n2);
		
		int res4 = n1 % n2;
		
		System.out.println("O resultado da div inteira convertido para double = " + res1);
		System.out.println("O resultado da div real  = " + res2);
		System.out.println("O resultado da div inteira convertido para double = " + res3);
		System.out.println("O resultado do resto da div = " + res4);
		
	}
	
	public static void main(String [] args){
		exemplo1();
	}
}