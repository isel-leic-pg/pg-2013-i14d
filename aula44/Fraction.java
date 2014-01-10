public class Fraction {
  private static int incCounter;
  private int num, den;
  
  public Fraction(int num, int den) {
    this.num = num;
    this.den = den;
  }
  public void incNum() {
    incCounter++;
    num++;
  }
  public Fraction mul(Fraction f) {
    return new Fraction(num * f.num, den * f.den);
  }
  
  public Fraction clone() {
    return new Fraction(this.num, this.den);
  }
  
  public double eval() {
    return num / den;
  }
  public void print() {
    System.out.println(num + "/" + den + " (incs=" + incCounter + ")");
  }

  public Fraction power(int n) {
    Fraction res = new Fraction(1, 1);
	for(int i = 0; i < n; i++){
	  res = this.mul(res);
	}
	return res;
	/*
    if(n == 0) return new Fraction(1, 1);
	int nm = num;
	int d = den;
	for(int i = 1; i < n; i++){
	  nm *= num;
	  d *= den;
	}
	return new Fraction(nm, d);
	*/
  }
}
