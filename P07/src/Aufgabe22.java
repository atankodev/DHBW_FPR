import java.io.*;
import java.util.Scanner;

public class Aufgabe22 {
	
	static String filename;
	static int linenumber;
	static String inputString;

	public static void main(String[] args) throws IOException {
	
		//Get filename, line number and inputString
		getInputs();
		
		//Create helper File and actual File
		File helperFile = new File("/Users/adriantanko/git/DHBW_FPR/P07/src/Blabla.txt");
		File file = new File("/Users/adriantanko/git/DHBW_FPR/P07/src/" + filename);
		
		//Get total number of lines in file
		int numberOfLines;
		numberOfLines = getNumberOfLines(file);
		
		//Adjust user input line number if it is out of range
		if(linenumber > numberOfLines) {
			linenumber = numberOfLines + 1; 
		} else if(linenumber < 0) {
			linenumber = 0;
		}
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(helperFile));
		
		//Copy first lines to Blabla.txt
		for(int i = 0; i < linenumber - 1; i++) {	
			bufferedWriter.write(bufferedReader.readLine() + '\n');
		}
		
		//Write new Line to Blabla.txt
		bufferedWriter.write(inputString);
		bufferedWriter.write('\n');
		
		//Copy missing lines to Blabla.txt
		String s;
		while((s = bufferedReader.readLine()) != null) {
			bufferedWriter.write(s + '\n');
		}
		
		bufferedReader.close();
		bufferedWriter.close();
		
		//Reconnect Reader and Writer
		bufferedWriter = new BufferedWriter(new FileWriter(file));
		bufferedReader = new BufferedReader(new FileReader(helperFile));
		
		//Copy Blabla.txt to File.txt
		while((s = bufferedReader.readLine()) != null) {
			bufferedWriter.write(s + '\n');
		}
		
		bufferedReader.close();
		bufferedWriter.close();

	}
	
	public static void getInputs() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte Dateinamen eingeben: ");
		filename = scanner.nextLine();
		
		System.out.print("Bitte Zeilennummer eingeben: ");
		linenumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Bitte Textzeile eingeben: ");
		inputString = scanner.nextLine();
		
		scanner.close();
	}
	
	public static int getNumberOfLines(File file) throws IOException {
		
		int count = 0;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
	
		while(bufferedReader.readLine() != null) {
			count ++;
		}
		bufferedReader.close();
		return count;
	}

}
