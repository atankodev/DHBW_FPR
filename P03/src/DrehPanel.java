import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrehPanel extends JPanel {
	
	static final double SCHRITTWEITE = (Math.PI/16);
	private GeoObjekt drehObjekt;
	JButton linksBtn, rechtsBtn, streckeBtn, dreieckBtn;
	
	public DrehPanel() {
		
		drehObjekt = erzeugeDreieck();
		
		linksBtn = new JButton("Links");
		rechtsBtn = new JButton("Rechts");
		streckeBtn = new JButton("Strecke");
		dreieckBtn = new JButton("Dreieck");
		
		linksBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt.drehen(-SCHRITTWEITE);
				repaint();
				
			}
		});
		
		rechtsBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt.drehen(SCHRITTWEITE);
				repaint();
				
			}
		});
		
		streckeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt = erzeugeStrecke();
				repaint();
				
			}
		});
		
		dreieckBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt = erzeugeDreieck();
				repaint();
				
			}
		});
		
		this.add(linksBtn);
		this.add(rechtsBtn);
		this.add(streckeBtn);
		this.add(dreieckBtn);
	}
	
	public Strecke erzeugeStrecke() {
		return new Strecke(new Punkt(0, 0), new Punkt(100, 0));
	}
	
	public Dreieck erzeugeDreieck() {
		return new Dreieck(new Punkt(0, 0), new Punkt(100, 0), new Punkt(50, -66));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drehObjekt.zeichnen(g, this.getWidth()/2, this.getHeight()/2);
	}

}
