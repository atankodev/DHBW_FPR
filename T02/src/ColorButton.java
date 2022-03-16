import java.awt.Color;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class ColorButton extends JButton {
	
	public ColorButton(String s) {
		
		Random rand = new Random();
		
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, g, b);
		
		this.setBackground(randomColor);
		this.setOpaque(true);
		this.setToolTipText(r + " " + g + " " + b);
		this.setText(s);
		
	}
	
	
	
}
