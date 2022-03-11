import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SampleJFrame extends JFrame {
	
	Container c;
	
	JLabel l;
	JButton b;
	JCheckBox cb;
	JPasswordField pf;
	JRadioButton rb1, rb2;
	JTextArea ta;
	
	public SampleJFrame() {
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(new Color(190, 227, 219));
		
		l = new JLabel("Hello JFrame!");
		
		b = new JButton("Change Background Color");
		ButtonListener bl = new ButtonListener();
		b.addActionListener(bl);
		
		cb = new JCheckBox("Check me!");
		pf = new JPasswordField("My secret password");
		
		rb1 = new JRadioButton("Radio Button 1");
		rb2 = new JRadioButton("Radio Button 2");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		ta = new JTextArea("A Text Area", 3, 10);
		
		c.add(l);
		c.add(b);
		c.add(cb);
		c.add(pf);
		c.add(rb1);
		c.add(rb2);
		c.add(ta);
		
	}

	public static void main(String[] args) {
		
		SampleJFrame sampleJFrame = new SampleJFrame();
		sampleJFrame.setSize(720, 480);
		sampleJFrame.setTitle("My first JFrame!");
		sampleJFrame.setVisible(true);
		sampleJFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(c.getBackground() == Color.white) {
				c.setBackground(new Color(190, 227, 219));
			} else {
				c.setBackground(Color.white);
			}
			
		}
		
	}

}
