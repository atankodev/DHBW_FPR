
public class Punkt {
	
	private double x, y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		
	}
	
	public void drehen(double phi) {
		x = x * Math.cos(phi) - y * Math.sin(phi);
		y = x * Math.sin(phi) + y * Math.cos(phi);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
}
