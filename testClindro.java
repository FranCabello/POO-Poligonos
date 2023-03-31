import java.util.Scanner;

import prueba.Clindro;

public class testClindro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double radio, altura, area, volumen;

		System.out.println("Introduzca el valor del radio del c�rculo: ");
		radio = sc.nextDouble();

		System.out.println("Introduzca la altura del cilindro: ");
		altura = sc.nextDouble();

		area = 2 * Math.PI * radio * (altura + radio);
		System.out.println("El �rea del cilindro es: " + area);

		volumen = Math.PI * Math.pow(radio, 2) * altura;
		System.out.println("El volumen del cilindro es: " + volumen);
		
		sc.close();
	}
}
