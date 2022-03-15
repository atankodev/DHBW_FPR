import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class NotenEingabeNeu extends JFrame {

	Container c;
	JRadioButton sg, gu, be, au, un;
	JCheckBox wdhBox;

	public NotenEingabeNeu() {
		
		c = getContentPane();
		c.setLayout(new GridLayout(6, 1));
		
		ButtonGroup bGroup = new ButtonGroup();
		
		sg = new JRadioButton("sehr gut");
		gu = new JRadioButton("gut");
		be = new JRadioButton("befriedigend");
		au = new JRadioButton("ausreichend");
		un = new JRadioButton("ungenügend");
		
		wdhBox = new JCheckBox("Wiederholungsklausur");
		
		bGroup.add(sg);
		bGroup.add(gu);
		bGroup.add(be);
		bGroup.add(au);
		bGroup.add(un);
		
		c.add(sg);
		c.add(gu);
		c.add(be);
		c.add(au);
		c.add(un);
		c.add(wdhBox);

	}

}
