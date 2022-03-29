import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	
	public TimeThread() {
		super();
		this.start();
	}

	public void run() {
		
		while(!Stoppuhr.stopFlag) {
			
			Date current = new Date();
			System.out.println(sdf.format(current));
			
			try {
				sleep(1000);
			} catch (InterruptedException ie) {	
				
			}
	
		}
		
	}
	
}
