public class Pto {
	private double x;
	private double y;

	public Pto() {
	}

	public Pto(double a, double b) {
		x = a;
		y = b;
	}

	public double abscisa() {
		return x;
	}

	public double ordenada() {
		return y;
	}

	public double distancia(Pto p) {
		double res = Math.sqrt(Math.pow((p.abscisa() - this.abscisa()), 2) + Math.pow((p.ordenada() - this.ordenada()), 2));
		return res;
	}

	public void abscisa(double a) {
		x = a;
	}

	public void ordenada(double b) {
		y = b;
	}

	public void trasladar(double a, double b) {
		x = x + a;
		y = y + b;
	}

	public String toString() {
		return ("(" + abscisa() + ", " + ordenada() + ")");
	}
}
