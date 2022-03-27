class KartenTerminal extends Thread {
	
	private KonzertDaten daten;

	KartenTerminal(String name, KonzertDaten daten) {
		super(name);
		this.daten = daten;
	}

	synchronized public void run() {

		for (int i = 0; i < 100; i++)

			System.out.println(getName() + ": Sitzplatz " + daten.freierPlatz() + " verkauft");

	}

}