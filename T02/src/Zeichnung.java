import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Zeichnung extends JPanel {
	
	int[] x, y;
	
	public Zeichnung(int[] x,int[] y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

	}
	
	public void paintComponent(Graphics g) {
		g.drawPolyline(x, y, 500);
	}

}
