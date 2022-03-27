class KonzertDaten {
	private int sitzPlatz = 0;

	synchronized int freierPlatz() { //hier hat synchronized gefehlt

		int n = sitzPlatz;
		long t = System.currentTimeMillis() + 50, s = t + 50;
		
		while (System.currentTimeMillis() < t)
			/* simuliere einen Datenbankzugriff */ ;
		
		Thread.yield(); // erlaube Aktivitaeten anderer Threads
		
		while (System.currentTimeMillis() < s)
			/* simuliere einen Datenbankzugriff */ ;
			return sitzPlatz = n + 1;

	}

}