import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rabattmarke implements Serializable {
	
	private int discountNumber;
	private String customerName;
	private int customerNumber;
	private double discount;
	private Date dateCreated;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYY");
	
	public Rabattmarke(int discountNumber, String customerName, int customerNumber, double discount) {
		
		this.discountNumber = discountNumber;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.discount = discount;
		this.dateCreated = new Date();
		
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public String toString() {
		return "Rabattmarke fuer " + customerName + " (Kd-Nr. " + customerNumber + ") in Hoehe von " + discount + "% ausgestellt am " + sdf.format(dateCreated);
	}

}
