import java.util.Calendar;

class App{

  static void myFunction1(){
    System.out.println("Ola");
	System.out.println("1");
	System.out.println("2");
	myFunction2();
  }
  static void myFunction2(){
    System.out.println("3");
	System.out.println("4");
  }

  public static void main(String[] args){
     myFunction1();
	 
	 // Neste caso, o nomem da classe é opcional porque 
	 // a função myFunction1 e main estão definidas dentro 
	 // da mesma classe.
	 App.myFunction1(); 
	 System.out.println(System.currentTimeMillis());
	 System.out.println(Calendar.getInstance());
  }
}
