package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а,
 *  используя метод вычисления площади треугольника.
 * */
public class task3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = in.nextDouble();
		System.out.println(areaOfATriangle(a) * 6);
	}

	/*
	 * Площадь правильного треугольника
	 */
	static double areaOfATriangle(double a) {
		return a * a * Math.sin(Math.toRadians(60)) / 2;
	}

}
