class Wert {
	private int wert;
	public static boolean verfuegbar = false;
	//public static int current

	synchronized public int get(int verbraucherNr) {
		if (!verfuegbar) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Verbraucher Nr. " + verbraucherNr + " got: " + wert);
		verfuegbar = false;
		notify();
		return wert;
	}

	synchronized public void put(int wert, int erzeugerNr) {
		if (verfuegbar) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Erzeuger Nr. " + erzeugerNr + " put: " + wert);
		this.wert = wert;
		verfuegbar = true;
		notify();

	}

}