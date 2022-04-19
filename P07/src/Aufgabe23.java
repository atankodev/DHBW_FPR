import java.io.*;
import java.util.Scanner;

public class Aufgabe23 {
	
	static String inputFileName;
	static String outputFileZahlen;
	static String outputFileRest;

	public static void main(String[] args) throws IOException {

		getInputs();
		
		FileReader fileReader = new FileReader(new File(("/Users/adriantanko/git/DHBW_FPR/P07/src/" + inputFileName)));
		StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);
		streamTokenizer.eolIsSignificant(true);
		
		FileWriter fileWriterZahlen = new FileWriter(new File(("/Users/adriantanko/git/DHBW_FPR/P07/src/" + outputFileZahlen)));
		FileWriter fileWriterRest = new FileWriter(new File(("/Users/adriantanko/git/DHBW_FPR/P07/src/" + outputFileRest)));
		
		int i;
		while((i = streamTokenizer.nextToken()) != streamTokenizer.TT_EOF) {
			
			if(i == streamTokenizer.TT_NUMBER) {
				fileWriterZahlen.write(Double.toString(streamTokenizer.nval));
				fileWriterZahlen.write(" ");
			} else if(i == streamTokenizer.TT_WORD) {
				fileWriterRest.write(streamTokenizer.sval);
				fileWriterRest.write(" ");
			} else if(i == streamTokenizer.TT_EOL) {
				fileWriterZahlen.write('\n');
				fileWriterRest.write('\n');
			}
			
		}
		
		fileReader.close();
		fileWriterZahlen.close();
		fileWriterRest.close();
		
		System.out.println("Datei " + inputFileName + " erfolgreich gesplittet in die Dateien " + outputFileZahlen + " und " + outputFileRest + ".");
		
	}

	static public void getInputs() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte Name der Textdatei eingeben: ");
		inputFileName = scanner.nextLine();
		
		System.out.print("Bitte Name der Zahlen-Ausgabedatei eingeben: ");
		outputFileZahlen = scanner.nextLine();
		
		System.out.print("Bitte Name der Rest-Ausgabedatei eingeben: ");
		outputFileRest = scanner.nextLine();
		
		scanner.close();
	}

}
