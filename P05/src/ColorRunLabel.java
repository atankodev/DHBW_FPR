import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ColorRunLabel extends JLabel implements Runnable {
	
	public boolean running = false;
	
	public ColorRunLabel(Color c) {
		
		setBackground(c);
		setOpaque(true);
		setFont(new Font("Arial", Font.BOLD, 50));
		setHorizontalAlignment(CENTER);
		
	}
	
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public void stop() {
		running = false;
	}

	@Override
	public void run() {
		
		while(running) {
			
			int rand = (int) ((Math.random() * 9));
			setText(rand+"");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
			
		}
		
	}
	
}
