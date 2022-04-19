import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadRabattmarken {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("/Users/adriantanko/git/DHBW_FPR/P07/src/Rabattmarken.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		int count = objectInputStream.readInt();
		System.out.println("Die Datei 'Rabattmarken.dat' enthaelt " + count + " Rabattmarken.");
		
		for(int i = 0; i < count; i++) {
			Rabattmarke rm = (Rabattmarke) objectInputStream.readObject();
			System.out.println(rm);
		}
		
		objectInputStream.close();
		
	}

}
