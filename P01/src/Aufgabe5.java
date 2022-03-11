import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Aufgabe5 extends JFrame {
	
	Container c;
	
	JLabel euroLbl;
	JTextField euroTxf, currTxf;
	JComboBox<String> comboBox;
	
	public Aufgabe5() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(4, 1));
		
		EuroAction euroAc = new EuroAction();
		CurrAction currAc = new CurrAction();
		
		euroLbl = new JLabel("Euro");
		
		euroTxf = new JTextField();
		euroTxf.addActionListener(euroAc);
		currTxf = new JTextField();
		currTxf.addActionListener(currAc);
		
		comboBox = new JComboBox<String>();
		for(int i = 0; i < 11; i++) {
			comboBox.addItem(EuroConverter.getBezeichnung(i));
		}
		comboBox.addActionListener(euroAc);
		
		c.add(euroLbl);
		c.add(euroTxf);
		c.add(comboBox);
		c.add(currTxf);
		
	}

	public static void main(String[] args) {
		
		Aufgabe5 a5 = new Aufgabe5();
		a5.setSize(250, 150);
		a5.setTitle("Aufgabe 5");
		a5.setVisible(true);
		a5.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} 
	
	class EuroAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			double input = Double.parseDouble(euroTxf.getText());
			int index = comboBox.getSelectedIndex();
			
			double output = EuroConverter.convertFromEuro(input, index);
			
			currTxf.setText(Double.toString(output));
			
		}
		
	}
	
	class CurrAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			double input = Double.parseDouble(currTxf.getText());
			int index = comboBox.getSelectedIndex();
			
			double output = EuroConverter.convertToEuro(input, index);
			
			euroTxf.setText(Double.toString(output));
			
		}
		
	}

}
