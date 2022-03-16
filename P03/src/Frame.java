import java.awt.Container;

import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	Container container;
	
	public Frame() {
		
		container = getContentPane();
		DrehPanel drehPanel = new DrehPanel();
		container.add(drehPanel);
		
	}

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		frame.setSize(375, 300);
		frame.setTitle("Geometry editor");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
