public class Traslaci�n {

	public class Punto {
		private double x;
		private double y;

		public Punto() {
			this(0, 0);
		}

		public Punto(double a, double b) {
			x = a;
			y = b;
		}

		public double abscisa() {
			return x;
		}

		public double ordenada() {
			return y;
		}

		public double distancia(Punto p) {
			double res = Math
					.sqrt(Math.pow((p.abscisa() - this.abscisa()), 2) + Math.pow((p.ordenada() - this.ordenada()), 2));
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

	public class Circulo extends Punto {
		private Punto centro;
		private double radio;

		public Circulo() {
			centro = new Punto();
			radio = 1;
		}

		public Circulo(Punto p, double r) {
			centro = p;
			radio = r;
		}

		public double radio() {
			return radio;
		}

		public Punto centro() {
			return centro;
		}

		public void radio(double r) {
			radio = r;
		}

		public void centro(Punto p) {
			centro = p;
		}
		
		public void trasladar (double a, double b) {
			centro.trasladar(a , b);
		}
		
		public String toString() {
			String center = centro.toString();
			return "El centro es " +center+ " y el radio mide " + radio;
		}
	}

	public class Cilindro extends Circulo {
		private Circulo base;
		private double altura;

		public Cilindro() {
			base = new Circulo();
			altura = 1;
		}

		public Cilindro(Circulo bs, double h) {
			base = bs;
			altura = h;
		}

		public double altura() {
			return altura;
		}

		public Circulo base() {
			return base;
		}

		public void altura(double h) {
			altura = h;
		}

		public void base(Circulo bs) {
			base = bs;
		}
		
		public void trasladar(double a, double b) {
			base.trasladar(a, b);
		}
		
		public String toString() {
			String bass = "La base es: "+base.toString();
			return bass + " y la altura es " + altura;
		}
	}
}


public class TestCilindro {
	public static void main(String[] args) {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(1,1);
		Circulo b = new Circulo(b, 5);
		Cilindro c = new Cilindro(b, 10.0);
		System.out.println(c);
		c.trasladar(2,3);
		System.out.println(c);
		System.out.println(new Cilindro(new Circulo(new Punto(5,-3), 5), 10.0));
	}
}
