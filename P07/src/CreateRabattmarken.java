import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CreateRabattmarken {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("/Users/adriantanko/git/DHBW_FPR/P07/src/Rabattmarken.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Anzahl der zu erzeugenden Rabattmarken: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		objectOutputStream.writeInt(count);
		
		for(int i = 0; i < count; i++) {
			
			System.out.println("------------------------");
			
			System.out.print("Daten fuer Rabattmarken-Nummer: ");
			int discountNumber = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Name des Rabattmarken-Besitzers: ");
			String customerName = scanner.nextLine();
			
			System.out.print("Kundennummer des Rabattmarken-Besitzers: ");
			int customerNumber = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Wert der Rabattmarke in Prozent: ");
			double discount = scanner.nextDouble();
			scanner.nextLine();
			
			Rabattmarke rm = new Rabattmarke(discountNumber, customerName, customerNumber, discount);
			objectOutputStream.writeObject(rm);
			
		}
		
		System.out.println("------------------------");
		System.out.println(count + " Rabattmarken in die Datei 'Rabattmarken.dat' geschrieben.");
		
		scanner.close();
		objectOutputStream.close();
		

	}

}
