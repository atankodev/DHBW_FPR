import java.io.*;

public class Aufgabe19 {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("Eingabe.txt");
		File outputFile = new File("Ausgabe.txt");
			
		FileReader fileReader = new FileReader(inputFile);
		FileWriter fileWriter = new FileWriter(outputFile);
		
		int c;
		
		while((c = fileReader.read()) != -1) {
			fileWriter.write(c);
		}
		
		fileReader.close();
		fileWriter.write("NEUE ZEILE");
		fileWriter.close();
		
	}

}
