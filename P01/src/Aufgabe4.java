import java.awt.*;
import java.awt.dnd.DropTargetContext;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe4 extends JFrame {
	
	Container c;
	
	JLabel operationLabel, equalsLabel, outputLabel;
	JTextField input1, input2;
	JButton addBtn, subBtn, mulBtn, divBtn, delBtn;
	ButtonGroup bg;
	
	public Aufgabe4() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(2, 5));
		
		operationLabel = new JLabel("");
		operationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equalsLabel = new JLabel("=");
		equalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outputLabel = new JLabel("");
		
		input1 = new JTextField();
		input2 = new JTextField();
		
		addBtn = new JButton("Addiere");
		subBtn = new JButton("Subtrahiere");
		mulBtn = new JButton("Multipliziere");
		divBtn = new JButton("Dividiere");
		delBtn = new JButton("Loesche Alles");
		
		ButtonListener addListener = new ButtonListener('+');
		ButtonListener subListener = new ButtonListener('-');
		ButtonListener mulListener = new ButtonListener('*');
		ButtonListener divListener = new ButtonListener('/');
		ButtonListener delListener = new ButtonListener('1');
		
		addBtn.addActionListener(addListener);
		subBtn.addActionListener(subListener);
		mulBtn.addActionListener(mulListener);
		divBtn.addActionListener(divListener);
		delBtn.addActionListener(delListener);
		
		c.add(input1);
		c.add(operationLabel);
		c.add(input2);
		c.add(equalsLabel);
		c.add(outputLabel);
		c.add(addBtn);
		c.add(subBtn);
		c.add(mulBtn);
		c.add(divBtn);
		c.add(delBtn);
		
	}

	public static void main(String[] args) {
		
		Aufgabe4 a4 = new Aufgabe4();
		a4.setSize(500, 100);
		a4.setTitle("Aufgabe 4");
		a4.setVisible(true);
		a4.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public class ButtonListener implements ActionListener {
		
		char op;
		
		public ButtonListener(char op) {
			this.op = op;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			double in1, in2, result;
		
			try {

				in1 = Double.parseDouble(input1.getText());
				in2 = Double.parseDouble(input2.getText());
				
				if(op == '+') {
					result = in1 + in2;
					outputLabel.setText(String.format("%.5f", result));
					operationLabel.setText("+");
				} else if(op == '-') {
					result = in1 - in2;
					outputLabel.setText(String.format("%.5f", result));
					operationLabel.setText("-");
				} else if(op == '*') {
					result = in1 * in2;
					outputLabel.setText(String.format("%.5f", result));
					operationLabel.setText("*");
				} else if(op == '/') {
					if(in2 != 0) {
						result = in1 / in2;
						outputLabel.setText(String.format("%.5f", result));
					} else {
						outputLabel.setText("Error");
						JOptionPane.showMessageDialog(c, "Fehler: Teilen durch Null", "Error", JOptionPane.ERROR_MESSAGE);
					}
					operationLabel.setText("/");
				}
				
			} catch(NumberFormatException nfe) {
				if(op != '1') {
					JOptionPane.showMessageDialog(c, "Fehler: Bitte gueltige Werte eingebe", "Error", JOptionPane.ERROR_MESSAGE);
					outputLabel.setText("Error");
				}
			}
			
			if(op == '1') {
				
				input1.setText("");
				input2.setText("");
				operationLabel.setText("");
				outputLabel.setText("");
				
			}
			
		}
		
	}

}
