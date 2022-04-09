import java.io.*;

public class NumberTester {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("/Users/adriantanko/git/DHBW_FPR/T06/src/Sample.txt");
		FileReader fileReader = new FileReader(inputFile);
		StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);

		int c;
		
		while((c = streamTokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
			
			if(c == StreamTokenizer.TT_NUMBER) {
				System.out.println("Vorsicht! Der Text enthält die Zahl " + streamTokenizer.nval);
				System.exit(0);
			}
			
		}
		
		System.out.println("Der Text ist 'sauber'!");

	}

}
