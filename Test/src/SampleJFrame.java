import java.awt.*;
import javax.swing.*;

public class SampleJFrame extends JFrame {
	
	Container c;
	JLabel l;
	
	public SampleJFrame() {
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		l = new JLabel("Hello JFrame!");
		
		c.add(l);
		
	}

	public static void main(String[] args) {
		
		SampleJFrame sampleJFrame = new SampleJFrame();
		sampleJFrame.setSize(720, 480);
		sampleJFrame.setTitle("My first JFrame!");
		sampleJFrame.setVisible(true);
		sampleJFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
