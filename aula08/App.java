import java.util.Calendar;
import java.io.InputStream;

class App{

	/*
	 * Distinção entre Tipos Valor e Referencia
	 */
	static void exemplo1(){
		// declaração de variáveis de tipo PRIMITIVO ou VALOR
		//short varS1, varS2;
		// <=>
		short varS1;
		int varA, varB;
		short varS2;
		double varC;

		varA = 3;
		varB = varA + 5;
		varC = 4.5;
		
		System.out.println(varA);
		System.out.println(varB);
		System.out.println(varC);
		
		// declaração de variáveis de tipo REFERÊNCIA ou COMPLEXO
		String str1, str2;
		Calendar cal;
		InputStream console;
			
		str1 = "Ola"; // "Ola" é um Objecto
		str2 = "Instituto Superior de Engenharia de LISBOA"; // Outro Objecto.
		cal = Calendar.getInstance();
		console = System.in;
		
		System.out.println(str1);
		System.out.println(cal);
		System.out.println(console);
	}

	static void exemplo2(){
		String str1 = "Ola";
		// <=> 
		String str2 = new String("Ola");
		
	}
	public static void main(String [] args){
		exemplo1();
	}
}