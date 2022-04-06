import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AutomatFrame extends JFrame {
	
	Container c;
	ColorRunLabel crl1, crl2, crl3;
	StartStopButton stspBtn1, stspBtn2, stspBtn3;
	
	public AutomatFrame() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(2, 3));
		
		crl1 = new ColorRunLabel(Color.red);
		crl2 = new ColorRunLabel(Color.yellow);
		crl3 = new ColorRunLabel(Color.green);
		
		stspBtn1 = new StartStopButton(Color.red);
		stspBtn2 = new StartStopButton(Color.yellow);
		stspBtn3 = new StartStopButton(Color.green);
		
		BtnListener btnListener1 = new BtnListener(stspBtn1, crl1);
		BtnListener btnListener2 = new BtnListener(stspBtn2, crl2);
		BtnListener btnListener3 = new BtnListener(stspBtn3, crl3);
		
		stspBtn1.addActionListener(btnListener1);
		stspBtn2.addActionListener(btnListener2);
		stspBtn3.addActionListener(btnListener3);
		
		c.add(crl1);
		c.add(crl2);
		c.add(crl3);
		c.add(stspBtn1);
		c.add(stspBtn2);
		c.add(stspBtn3);
		
	}
	
	public static void main(String[] args) {
		
		AutomatFrame f = new AutomatFrame();
		f.setSize(450, 200);
		f.setTitle("Spielautomat");
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	class BtnListener implements ActionListener {
		
		StartStopButton stspBtn;
		ColorRunLabel crl;
		
		public BtnListener(StartStopButton stspBtn, ColorRunLabel crl) {
			this.stspBtn = stspBtn;
			this.crl = crl;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(crl.running) {
				crl.stop();
			} else {
				crl.start();
			}
			stspBtn.switchText();
			
		}
		
	}
	
}
