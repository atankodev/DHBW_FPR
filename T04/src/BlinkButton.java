import javax.swing.*;

@SuppressWarnings("serial")
public class BlinkButton extends JButton implements Runnable {
	
	static String tauschText = "Hoppala";
	
	public BlinkButton(String string) {
		super(string);
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				
			}
			String help = this.getText();
			this.setText(tauschText);
			tauschText = help;
		}
	}
	
}
