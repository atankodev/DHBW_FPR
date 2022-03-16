import java.awt.Graphics;

public class Strecke implements GeoObjekt {
	
	private Punkt p1, p2;
	
	public Strecke(Punkt p1, Punkt p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void drehen(double phi) {
		p1.drehen(phi);
		p2.drehen(phi);
	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		
		g.drawLine(
				(int) p1.getX() + xNull, 
				(int) p1.getY() + yNull, 
				(int) p2.getX() + xNull, 
				(int) p2.getY() + yNull
			);

	}

}
