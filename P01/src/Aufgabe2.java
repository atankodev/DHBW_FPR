import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Aufgabe2 extends JFrame {
	
	Container c;
	private JLabel beschriftung, datumsAnzeige;
	private JComboBox<String> formatAuswahl;
	private Date datum = new Date();
	private JButton aktualisierung;
	private static final SimpleDateFormat kurz = new SimpleDateFormat("E, d. MMMMM, HH:mm");
	private static final SimpleDateFormat mittel = new SimpleDateFormat("d. MMMMM, HH:mm:ss");
	private static final SimpleDateFormat lang = new SimpleDateFormat("dd.MM.yyyy (HH:mm)");
	
	public static SimpleDateFormat gewaehlt = kurz;

	
	public Aufgabe2() {
		
		c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		
		String[] auswahl = {"Tag, Datum, Uhrzeit", "Datum und Uhrzeit mit Sekunden", "Datum mit Jahr und Uhrzeit"};
		formatAuswahl = new JComboBox<String>(auswahl);
		AnzeigeListener il = new AnzeigeListener();
		formatAuswahl.addItemListener(il);
		
		beschriftung = new JLabel("Datum und Uhrzeit:");
		datumsAnzeige = new JLabel(gewaehlt.format(datum));
		
		KnopfHorcher kh = new KnopfHorcher(datumsAnzeige);
		aktualisierung = new JButton("Anzeige aktualisieren");
		aktualisierung.addActionListener(kh);
		
		c.add(formatAuswahl, BorderLayout.NORTH);
		c.add(beschriftung, BorderLayout.WEST);
		c.add(datumsAnzeige, BorderLayout.EAST);
		c.add(aktualisierung, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		
		Aufgabe2 a2 = new Aufgabe2();
		a2.setTitle("Aufgabe 2");
		a2.setSize(350, 200);
		a2.setVisible(true);
		a2.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	class AnzeigeListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			int index = formatAuswahl.getSelectedIndex();
			datum = new Date();
			
			switch(index) {
			
			case 0:
				gewaehlt = kurz;
				datumsAnzeige.setText(gewaehlt.format(datum));
				break;
				
			case 1:
				gewaehlt = mittel;
				datumsAnzeige.setText(gewaehlt.format(datum));
				break;
				
			case 2:
				gewaehlt = lang;
				datumsAnzeige.setText(gewaehlt.format(datum));
				break;
			
			}
			
		}
		
	}
	
	class KnopfHorcher implements ActionListener {
		
		JLabel anzeige;
		
		public KnopfHorcher(JLabel anzeige) {
			this.anzeige = anzeige;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			datum = new Date();
			anzeige.setText(gewaehlt.format(datum));
		}
		
	}

}
