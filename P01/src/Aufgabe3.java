import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe3 extends JFrame {
	
	Container c;
	JRadioButton radioRot, radioGelb, radioGruen;
	JButton buttonRot, buttonGelb, buttonGruen;
	
	public Aufgabe3() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		
		//Radio Buttons
		radioRot = new JRadioButton("rot");
		radioGelb = new JRadioButton("gelb");
		radioGruen = new JRadioButton("gruen");
		
		radioRot.setSelected(true);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioRot);
		bg.add(radioGelb);
		bg.add(radioGruen);
		
		//Buttons
		buttonRot = new JButton();
		buttonGelb = new JButton();
		buttonGruen = new JButton();
		
		buttonRot.setBackground(Color.red);
		buttonRot.setOpaque(true);
		buttonRot.setBorderPainted(false);
		buttonRot.setFocusPainted(false);
		buttonGelb.setBackground(Color.black);
		buttonGelb.setOpaque(true);
		buttonGelb.setBorderPainted(false);
		buttonGelb.setFocusPainted(false);
		buttonGruen.setBackground(Color.black);
		buttonGruen.setOpaque(true);
		buttonGruen.setBorderPainted(false);
		buttonGruen.setFocusPainted(false);
		
		//Action Listener
		ButtonListener bl = new ButtonListener();
		radioRot.addActionListener(bl);
		radioGelb.addActionListener(bl);
		radioGruen.addActionListener(bl);
		buttonRot.addActionListener(bl);
		buttonGelb.addActionListener(bl);
		buttonGruen.addActionListener(bl);
		
		//Add Components to Container
		c.add(radioRot);
		c.add(buttonRot);
		c.add(radioGelb);
		c.add(buttonGelb);
		c.add(radioGruen);
		c.add(buttonGruen);
		
	}

	public static void main(String[] args) {
		
		Aufgabe3 a3 = new Aufgabe3();
		a3.setSize(250, 150);
		a3.setTitle("Aufgabe 3");
		a3.setVisible(true);
		a3.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			AbstractButton activeButton = (AbstractButton) e.getSource();
			
			if(activeButton == radioRot || activeButton == buttonRot) {
				
				radioRot.setSelected(true);
				buttonRot.setBackground(Color.red);
				buttonGelb.setBackground(Color.black);
				buttonGruen.setBackground(Color.black);
				
			} else if (activeButton == radioGelb || activeButton == buttonGelb) {
				
				radioGelb.setSelected(true);
				buttonRot.setBackground(Color.black);
				buttonGelb.setBackground(Color.yellow);
				buttonGruen.setBackground(Color.black);
				
			} else if (activeButton == radioGruen || activeButton == buttonGruen) {
				
				radioGruen.setSelected(true);
				buttonRot.setBackground(Color.black);
				buttonGelb.setBackground(Color.black);
				buttonGruen.setBackground(Color.green);
				
			}
			
		}
		
	}

}
