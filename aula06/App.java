class App{

	static void exemplo1(){
	
		System.out.println(3); // um valor de tipo inteiro (em Java: int - 4 bytes)
		System.out.println(3 + 4); // o resultado da expressão é de tipo inteiro (em Java: int - 4 bytes)
		System.out.println(4.5); // um valor de tipo real (em Java: double - 8 bytes)
		
		// um valor de tipo sequência de caracteres (em Java: String)
		// neste caso serão 16 bytes.
		// o numero de bytes ocupados em memoria depende do numero de caracteres.
		System.out.println("Ola"); 

	}

	static void exemplo2(){
		// declaração de variáveis
		int varA, varB;
		double varC;
		String str;
			
			
		varA = 3;
		varB = varA + 5;
		varC = 4.5;
		str = "Ola";
		System.out.println(varA);
		System.out.println(varB);
		System.out.println(varC);
		System.out.println(str);
	}

	static void exemplo3(){
		// declaração de variáveis
		int varA, varB;
		double varC;
		float varD;
		long varE;
		String str;
		
		// Erro de compilação: uma expressão de tipo real não é compativel com um inteiro.
		// varA = 4.5; 
		
		// As variáveis varB e varD são representadas em memoria de formas diferentes.
		varB = 5;
		varD = 5;
		
		varC = 5; // Válido: pq não há perca de informação para o programador.
		
		varE = System.currentTimeMillis();
	}
	
	static void exemplo4(){
		// declaração de variáveis
		int varA, varB;
		long varE;
		
		// Erro de compilação: uma expressão de tipo real não é compativel com um inteiro.
		// varA = 4.5; 
		varA = (int) 4.5; 
		varE = System.currentTimeMillis();
		varB = (int) varE;
		System.out.println(varA);
		System.out.println(varE);
		System.out.println(varB);
	}
	
	public static void main(String [] args){
		// exemplo1();
		// exemplo2();
		// exemplo3();
		exemplo4();
	}
}