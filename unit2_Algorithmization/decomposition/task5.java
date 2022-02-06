package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 *	которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class task5 {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Array size : ");
		int n = in.nextInt();
		double[] a = new double[n];
		double max = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + i);
			double ai = in.nextDouble();
			a[i] = ai;
			if (ai > max)
				max = ai;
		}
		System.out.println("second largest number :"+subMax(a, max));
	}

	/*
	 * Нахождение максимального числа, меньшего, чем max
	 */
	static double subMax(double[] a, double max) {
		double result = Double.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			double ai = a[i];
			if (ai > result && ai < max)
				result = ai;
		}
		if (result == Double.MIN_VALUE) {
			System.out.println("Не найдено.");
			System.exit(1);
		}
		return result;
	}
}
