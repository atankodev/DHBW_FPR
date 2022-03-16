import java.awt.Graphics;

public class Dreieck implements GeoObjekt {
	
	protected Punkt p1, p2, p3;
	private Strecke s1, s2, s3;
	
	public Dreieck(Punkt p1, Punkt p2, Punkt p3) {
		s1 = new Strecke(p1, p2);
		s2 = new Strecke(p2, p3);
		s3 = new Strecke(p1, p3);
	}

	@Override
	public void drehen(double phi) {
		p1.drehen(phi);
		p2.drehen(phi);
		p3.drehen(phi);
	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		s1.zeichnen(g, xNull, yNull);
		s2.zeichnen(g, xNull, yNull);
		s3.zeichnen(g, xNull, yNull);
	}

}
