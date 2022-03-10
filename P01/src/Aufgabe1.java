import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

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
		a1.setSize(250, 150);
		a1.setVisible(true);
		a1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	class ButtonBearbeiter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Random rand = new Random();
			
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			
			Color randomColor = new Color(r, g, b);
			
			c.setBackground(randomColor);
			
		}
		
	}
	
	class MausBearbeiter implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			c.setBackground(Color.white);
			
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
