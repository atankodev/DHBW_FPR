import java.io.*;

public class Aufgabe19 {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("/Users/adriantanko/git/DHBW_FPR/T06/src/Eingabe.txt");
		File outputFile = new File("/Users/adriantanko/git/DHBW_FPR/T06/src/Ausgabe.txt");
			
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		FileWriter fileWriter = new FileWriter(outputFile);
		
		fileWriter.write(bufferedReader.readLine() + "\n");
		fileWriter.write("NEUE ZEILE\n");
		fileWriter.write(bufferedReader.readLine() + "\n");
		
		fileReader.close();
		bufferedReader.close();
		fileWriter.close();
		
	}

}