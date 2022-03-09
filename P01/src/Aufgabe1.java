import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aufgabe1 extends JFrame {
	
	Container c;
	JButton button;
	ButtonBearbeiter bb;
	MausBearbeiter mb;
	
	public Aufgabe1() {
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		mb = new MausBearbeiter();
		c.addMouseListener(mb);
		
		button = new JButton("Drueck mich!");
		bb = new ButtonBearbeiter();
		button.addActionListener(bb);
		
		c.add(button);
		
	}
	
	public static void main(String[] args) {
		
		Aufgabe1 a1 = new Aufgabe1();
		a1.setTitle("Aufgabe1");
		a1.setSize(720, 480);
		a1.setVisible(true);
		a1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	class ButtonBearbeiter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			c.setBackground(Color.black);
			
		}
		
	}
	
	class MausBearbeiter implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			c.setBackground(Color.white);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}		
		
	}

}
