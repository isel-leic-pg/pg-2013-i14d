import java.util.Calendar;
import java.io.InputStream;
import java.util.Scanner;

class App{

	static Scanner cin = new Scanner(System.in);

	/*
	 * Exemplo de utilização do Operador . (ponto) para acesso 
	 * a membros de um objecto ou de uma classe.
	 */
	static void exemplo1(){
		String str1 = "Ola";
		// <=> 
		String str2 = new String("Ola");
		
		int str1Size = str1.length(); // Acesso à função length() do objecto str1
		long timeInMilis = System.currentTimeMillis(); //// Acesso à função da classe System
		
		/*
		 * str1Size é convertido de inteiro para string 
		 * e concatenado com o outro objecto String.
		 */
		String msg1 = "length of string Ola = " + str1Size;
		
		System.out.println(msg1);
		System.out.println("current time in milis = " + timeInMilis);
		
	}
	
	static void leConsola(){
		// Scanner cin = new Scanner(System.in);
		
		System.out.println("Introduza um valor inteiro:");
		int n1 = cin.nextInt();
		System.out.println("Introduza uma string:");
		// String s = cin.nextInt(); // => ERRO = tipos diferentes
		String s = cin.next();
		System.out.println(n1);
		System.out.println(s);
		
	}
	
	static void lab1(){
		int teste, f1, f2, f3, p, notaFinal;
		double notaFinalReal;
		
		System.out.println("Teste final ?");
		// teste = nextInt(); 
		teste = App.cin.nextInt(); 

		System.out.println("3 melhores fichas ?");
		f1 = cin.nextInt(); 
		f2 = cin.nextInt(); 
		f3 = cin.nextInt(); 
		
		System.out.println("Componente pratica ?");
		p = cin.nextInt();
		
		notaFinalReal = 0.4*teste + (f1 + f2 +f3)/3*0.2 + 0.4*p;
		/*
		 * Operador de Casting => perca de informação
		 */
		notaFinal = (int) notaFinalReal ;
		
		System.out.println("Nota final = " + notaFinalReal);
		System.out.println("Nota final arredondada = " + notaFinal);
	}
	
	public static void main(String [] args){
		// exemplo1();
		// leConsola();
		lab1();
	}
}