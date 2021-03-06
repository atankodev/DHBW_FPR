import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class VierButtonFrame extends JFrame {
	Container c;

	public VierButtonFrame(int i) {

		c = getContentPane();
		if (i == 1)

			c.setLayout(new FlowLayout());
		else if (i == 2)

			c.setLayout(new BorderLayout());
		else if (i == 3)

			c.setLayout(new GridLayout());
		else

			c.setLayout(new GridLayout(0, 1));

		c.add(new ColorButton("A"));
		c.add(new ColorButton("B"));
		c.add(new ColorButton("C"));
		c.add(new ColorButton("D"));

	}

	public static void main(String[] args) {

		VierButtonFrame[] fenster = new VierButtonFrame[4];

		for (int i = 0; i < 4; i++) {

			fenster[i] = new VierButtonFrame(i + 1);

			fenster[i].setTitle("Fenster " + (i + 1));
			fenster[i].setSize(200, 200);
			fenster[i].setLocation(i * 200, 0);
			fenster[i].setVisible(true);
			fenster[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

	}

}