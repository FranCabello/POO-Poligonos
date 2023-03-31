public class Clindro extends Crculo {
	private Crculo base;
	private double altura;

	public Clindro() {
		base = new Crculo();
		altura = 1;
	}

	public Clindro(Crculo bs, double h) {
		base = bs;
		altura = h;
	}

	public double altura() {
		return altura;
	}

	public Crculo base() {
		return base;
	}

	public void altura(double h) {
		altura = h;
	}

	public void base(Crculo bs) {
		base = bs;
	}

	public void trasladar(double a, double b) {
		base.trasladar(a, b);
	}

	public String toString() {
		String bass = "La base es: " + base.toString();
		return bass + " y la altura es " + altura;
	}
}