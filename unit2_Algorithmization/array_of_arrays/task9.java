package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.
*/
public class task9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter m, n :");
		int m = in.nextInt();
		int n = in.nextInt();
		double[][] a = new double[m][n]; // Неотрицательные - не обязательно целые!
		double[] s = new double[n]; // Суммы столбцов

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter " + i + " " + j);
				double aij = in.nextDouble();
				a[i][j] = aij;
				s[j] += aij;
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int max = 0; // Столбец с максимальной суммой
		for (int j = 0; j < n; j++) {
			if (s[j] > s[max]) {
				max = j;
			}
			System.out.print(s[j] + " ");
		}
		System.out.println("\n" + (max + 1));
	}
}
