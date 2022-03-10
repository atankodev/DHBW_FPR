import java.awt.*;
import java.awt.dnd.DropTargetContext;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe4 extends JFrame {
	
	Container c;
	
	JLabel operationLabel, equalsLabel, outputLabel;
	JTextField input1, input2;
	JButton addBtn, subBtn, mulBtn, divBtn, delBtn;
	
	public Aufgabe4() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(2, 5));
		
		operationLabel = new JLabel("+");
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

}
