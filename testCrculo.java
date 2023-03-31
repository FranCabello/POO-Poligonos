import prueba.Crculo;

public class testCrculo {

	public static void main(String[] args) {

		double dis;

		Pto c = new Pto();
		double x1 = 5;
		double y1 = -3;

		Pto o = new Pto();
		double x2 = 0;
		double y2 = 0;

		dis = Math.sqrt((x2 - (x1 + 2)) * (x2 - (x1 + 2)) + (y2 - (y1 + 3)) * (y2 - (y1 + 3)));
		System.out.println("La distancia entre el centro del c�rculo y el origen de coordenadas es: " + dis);
	}
}
