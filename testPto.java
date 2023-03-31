import java.util.Scanner;
import prueba.Pto;

public class testPto {

	public static void main(String[] args) {

		double sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer punto: ");
		Pto p1 = new Pto();
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		p1.abscisa(x1);
		p1.ordenada(y1);

		Pto p2 = new Pto();
		System.out.println("Introduzca el segundo punto: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		p2.abscisa(x2);
		p2.ordenada(y2);

		dis(x1, x2, y1, y2);
		
		sc.close();
	}

	private static void dis(double x1, double x2, double y1, double y2) {
		double sum = Math.sqrt((x2 - (x1 + 2)) * (x2 - (x1 + 2)) + (y2 - (y1 + 3)) * (y2 - (y1 + 3)));
		System.out.println("La distancia entre los puntos es: " + sum);
	}
}