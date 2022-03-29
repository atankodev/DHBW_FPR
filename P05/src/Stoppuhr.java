import java.util.Date;
import java.util.Scanner;

public class Stoppuhr {
	
	static public boolean stopFlag = false;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Stoppuhr starten mit Eingabetaste!");
		
		in.nextLine();

		Date startTime = new Date();
		System.out.println("Startzeitpunkt: " + startTime);
		System.out.println();
		TimeThread thread = new TimeThread();
		
		in.nextLine();
		
		stopFlag = true;
		Date stopTime = new Date();
		System.out.println("Stoppzeitpunkt: " + stopTime);
		long diff = stopTime.getTime() - startTime.getTime();
		System.out.println("Gesamtlaufzeit: " + diff + "ms");
		
		in.close();
		thread.interrupt();
	}
}
