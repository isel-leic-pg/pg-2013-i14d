
public class Point {

	private int x, y;

	public Point(int xInit, int yInit) {
		x = xInit;
		y = yInit;
	}
	/*
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	*/
	public double distance(Point p){
		int dx = x - p.x;
		int dy = y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}
