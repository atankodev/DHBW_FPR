import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class StartStopButton extends JButton {

	public StartStopButton(Color c) {

		setBackground(c);
		setOpaque(true);
		setFocusPainted(false);
		setBorderPainted(false);
		setFont(new Font("Arial", Font.PLAIN, 25));
		setHorizontalAlignment(CENTER);
		setText("START");

	}
	
	public boolean isStart() {
		if(getText().equals("START")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void switchText() {
		if(getText().equals("START")) {
			setText("STOP");
		} else {
			setText("START");
		}
	}

}
