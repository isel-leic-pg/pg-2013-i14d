import java.util.Scanner;


public class App {

	
	static Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduza as coordenadas de um ponto: ");
		Point p1 = new Point(cin.nextInt(), cin.nextInt());
		System.out.println("Introduza as coordenadas de outro ponto: ");
		Point p2 = new Point(cin.nextInt(), cin.nextInt());
		System.out.println("Distancia entre " + p1 + " e " + p2 + " = " + p1.distance(p2));
	}

}
