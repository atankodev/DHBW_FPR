import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Aufgabe3 extends JFrame {
	
	Container container;
	
	JLabel argJLabel, outputLabel;
	JTextField inputTextField;
	JCheckBox logCheckBox, sqrtCheckBox;
	ButtonGroup buttonGroup;
	JButton calcButton;

	public Aufgabe3() {
		
		container = getContentPane();
		container.setLayout(new GridLayout(2, 3));
		
		ButtonListener buttonListener = new ButtonListener();
		
		argJLabel = new JLabel("Argument");
		argJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputTextField = new JTextField();
		
		logCheckBox = new JCheckBox("Logarithmus", true);
		logCheckBox.addActionListener(buttonListener);
		sqrtCheckBox = new JCheckBox("Quadratwurzel");
		sqrtCheckBox.addActionListener(buttonListener);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(logCheckBox);
		buttonGroup.add(sqrtCheckBox);
		
		calcButton = new JButton("Berechne");
		calcButton.addActionListener(buttonListener);
		outputLabel = new JLabel();
		
		container.add(argJLabel);
		container.add(logCheckBox);
		container.add(calcButton);
		container.add(inputTextField);
		container.add(sqrtCheckBox);
		container.add(outputLabel);
		
	}
	
	public static void main(String[] args) {
		
		Aufgabe3 aufgabe3 = new Aufgabe3();
		aufgabe3.setSize(500, 100);
		aufgabe3.setTitle("Aufgabe 3");
		aufgabe3.setVisible(true);
		aufgabe3.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			double result;
			
			try {
				
				double input = Double.parseDouble(inputTextField.getText());
				
				if(logCheckBox.isSelected()) {
					
					result = Math.log(input);
					outputLabel.setText("" + result);
					
				} else if(sqrtCheckBox.isSelected()) {
					
					result = Math.sqrt(input);
					outputLabel.setText("" + result);
					
				}
				
			} catch (NumberFormatException nfe) {
				
				outputLabel.setText("Error");
				JOptionPane.showMessageDialog(container, "Ungueltige Eingabe!");
				
			}
			
			
			
		}
		
	}
	
}
