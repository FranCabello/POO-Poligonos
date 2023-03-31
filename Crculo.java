public class Crculo extends Pto {
	private Pto centro;
	private double radio;

	public Crculo() {
		centro = new Pto();
		radio = 1;
	}

	public Crculo(Pto p, double r) {
		centro = p;
		radio = r;
	}

	public double radio() {
		return radio;
	}

	public Pto centro() {
		return centro;
	}

	public void radio(double r) {
		radio = r;
	}

	public void centro(Pto p) {
		centro = p;
	}

	public void trasladar(double a, double b) {
		centro.trasladar(a, b);
	}

	public String toString() {
		String center = centro.toString();
		return "El centro es " + center + " y el radio mide " + radio;
	}
}