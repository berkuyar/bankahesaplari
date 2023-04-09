package hafta3bahardonemm;

public class Point {
	
	
	private int x;
	private int y;
	
	public Point () {
		x = 0;
		y = 0;
		
	}
	public Point (int initialX , int initialY ) {
		x = initialX;
		y = initialY;
		
	}
	
	public Point (int x ) {
		this.x = x;
		
	}
	
	public double distanceFromOrigin(int x , int y) {
		return Math.sqrt(x * x + y * y );
		
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setLocation(int newX , int newY) {
		x = newX;
		y = newY;
	}
	public void translate(int dx , int dy) {
		System.out.println(x + " , " + y);
		setLocation (x + dx , y + dy);
	}
	public static void print () {
		System.out.println("print methods");
		
	}
	
}
