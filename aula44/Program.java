public class Program {

  public static void main(String[] args) {
	int p = 3;
	Fraction f1 = new Fraction(2, 3);	
	Fraction res = f1.power(p);
	f1.print();
	System.out.print("^" + p + " = ");
	res.print();
  }
  
  public static void testPointIdentity() {
	Point p = new Point(5,7);
	System.out.println(p);
	
	System.out.println(p.getClass().getName() + "@" + p.hashCode());
	
  }
  
  public static void q3() {
    Fraction f1 = new Fraction(1, 4);
    f1.incNum();
    Fraction f2 = f1.clone();
	
	System.out.print("f1 ref = " + f1 +  " ");
    f1.print();
	System.out.print("f2 ref = " + f2 +  " ");
    f2.print();
    
	System.out.println("########## Depois do Clone e de Incrementar f2: ##########");
	
    f2.incNum();
    Fraction f3 = f1.mul(f2);
	System.out.print("f1 ref = " + f1 +  " ");
    f1.print();
    System.out.println("*");
	System.out.print("f2 ref = " + f2 +  " ");
    f2.print();
    System.out.println("=");
	System.out.print("f3 ref = " + f3 +  " ");
    f3.print();
  }	

  
  public static void q1() {
    Fraction f1 = new Fraction(1, 4);
    f1.incNum();
    Fraction f2 = f1;
    f2.incNum();
    Fraction f3 = f1.mul(f2);
	System.out.print("f1 ref = " + f1 +  " ");
    f1.print();
    System.out.println("*");
	System.out.print("f2 ref = " + f2 +  " ");
    f2.print();
    System.out.println("=");
	System.out.print("f3 ref = " + f3 +  " ");
    f3.print();
  }	
}
