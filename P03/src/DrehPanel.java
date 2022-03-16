import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrehPanel extends JPanel {
	
	static final double SCHRITTWEITE = Math.PI/60;
	private GeoObjekt drehObjekt;
	JButton linksBtn, rechtsBtn, streckeBtn, dreieckBtn;
	
	public DrehPanel() {
		linksBtn = new JButton("Links");
		rechtsBtn = new JButton("Rechts");
		streckeBtn = new JButton("Strecke");
		dreieckBtn = new JButton("Dreieck");
		
		linksBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt.drehen(-SCHRITTWEITE);
				
			}
		});
		
		rechtsBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drehObjekt.drehen(SCHRITTWEITE);
				
			}
		});
		
		streckeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
		
		dreieckBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
		
		this.add(linksBtn);
		this.add(rechtsBtn);
		this.add(streckeBtn);
		this.add(dreieckBtn);
	}

}
