
class Erzeuger extends Thread {
	private Wert w;

	private int nr;

	public Erzeuger(Wert c, int n) {

		w = c;

		nr = n;

	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			w.put(i, nr);
			
			try {
				sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}

		}

	}

}