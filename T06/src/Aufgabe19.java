import java.io.*;

public class Aufgabe19 {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("/Users/adriantanko/git/DHBW_FPR/T06/src/Eingabe.txt");
		File outputFile = new File("/Users/adriantanko/git/DHBW_FPR/T06/src/Ausgabe.txt");
			
		FileReader fileReader = new FileReader(inputFile);
		FileWriter fileWriter = new FileWriter(outputFile);
		
		int c;
		
		while((c = fileReader.read()) != (int) '\n') {
			fileWriter.write(c);
		}
		
		fileWriter.write("NEUE ZEILE");
		fileWriter.write("\n");
		
		while((c = fileReader.read()) != -1) {
			fileWriter.write(c);
		}
		
		fileReader.close();
		fileWriter.close();
		
	}

}
