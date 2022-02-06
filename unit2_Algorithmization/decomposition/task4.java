package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 4. На плоскости заданы своими координатами n точек. 
Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
Указание. Координаты точек занести в массив.
*/
public class task4 {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		if (n < 2) {
			System.out.println("Недостаточно точек");
			System.exit(1);
		}
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("point coordinates " + (i+1) + " x, y:");
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
		}
		printDistantPoints(x, y);
	}

	/*
	 * Нахождение и вывод пары точек, между которыми самое большое расстояние
	 */
	static void printDistantPoints(double[] x, double[] y) {
		int n = x.length;
		double maxDistance = -1; // Квадрат расстояния
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				double dX = x[j] - x[i];
				double dY = y[j] - y[i];
				double distance = dX * dX + dY * dY;
				if (distance > maxDistance) {
					maxDistance = distance;
					maxI = i;
					maxJ = j;
				}
			}
		}
		System.out.println("print distant points "+ (maxI+1) + " " + (maxJ+1));
	}
}
