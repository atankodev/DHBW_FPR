import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TestFrame extends JFrame {
	
	Container container;
	BlinkButton blinkButton;
	
	public TestFrame() {
		container = getContentPane();
		blinkButton = new BlinkButton("Klausur");
		container.add(blinkButton);
	}
	public static void main(String[] args) {
		
		TestFrame testFrame = new TestFrame();
		testFrame.setSize(250, 100);
		testFrame.setTitle("Test Frame");
		testFrame.setVisible(true);
		testFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
