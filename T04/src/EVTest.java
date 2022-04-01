public class EVTest {

	public static void main(String args[]) {
		Wert c = new Wert();
		Erzeuger e1 = new Erzeuger(c, 1);
		Erzeuger e2 = new Erzeuger(c, 2);
		Verbraucher v1 = new Verbraucher(c, 1);
		Verbraucher v2 = new Verbraucher(c, 2);
		e1.start();
		e2.start();
		v1.start();
		v2.start();

	}

}