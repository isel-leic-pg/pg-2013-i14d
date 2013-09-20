import java.util.Calendar;

class App{

  private static void myFunction(){
    System.out.println("myFunction called!");
  }

  public static void main(String[] args){
    myFunction();
	App.myFunction(); // Prefixo App. é opcional pq myFunction pertence à mesma classe.
	System.out.println("Ola Mundo!"); // System é a class. println() é a função.
	java.lang.System.out.println("Ola Mundo!"); // System é a class. println() é a função.
	// System.out.println(Calendar.getInstance());
	System.out.println(java.util.Calendar.getInstance());
	
  }

}