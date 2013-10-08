import java.util.Calendar;
import java.io.InputStream;
import java.util.Scanner;

class AppChars{

	static Scanner cin = new Scanner(System.in);

	/*
	 * manipulação entre caracteres e inteiros
	 */
	static void exemplo1(){
		char c = 'A';
		System.out.println(c);
		
		int codigoDeC = c;
		System.out.println("codigo do caracter " + c + " = " + codigoDeC);
		
		short codigoDeC2 = 66;
		char c2 = (char) codigoDeC2;
		System.out.println("codigo do caracter " + c2 + " = " + codigoDeC2);
		
		char c3 = 'a';
		int dif = c3 - c;
		System.out.println("Diferenca entre a e A = " + dif);
		
		System.out.println("Introduza um caracter em minusculas:");
		String s = cin.next();
		char c4 = s.charAt(0);
		char c4maiusculas = (char) (c4 - dif);
		System.out.println("O caracter " + c4 + " em maiusculas = " + c4maiusculas);
	}
	
	/*
	 * Reutilização do toUpperCase do objecto String
	 */
	static void exemplo2(){
		System.out.println("Introduza um caracter em minusculas:");
		String s = cin.next();
		char c4 = s.charAt(0);
		String sMaiusculas = s.toUpperCase();
		char c4maiusculas = sMaiusculas.charAt(0);
		// <=> char c4maiusculas = s.toUpperCase().charAt(0);
		
		System.out.println("O caracter " + c4 + " em maiusculas = " + c4maiusculas);
	}
	
	public static void main(String [] args){
		exemplo2();
	}
}