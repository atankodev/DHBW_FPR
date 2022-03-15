import javax.swing.*;

@SuppressWarnings("serial")
public class NotenEingabeTest extends JFrame {

	public static void main(String[] args) {
		
		NotenEingabe notenEingabe = new NotenEingabe();
		notenEingabe.setSize(175, 225);
		notenEingabe.setVisible(true);
		notenEingabe.setTitle("Noten Eingabe");
		notenEingabe.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
