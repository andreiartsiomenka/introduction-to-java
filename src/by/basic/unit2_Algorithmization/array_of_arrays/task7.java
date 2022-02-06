package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;
/*
 * 7.Сформировать квадратную матрицу порядка N по правилу:
 * 
 * */

public class task7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = in.nextInt();
		double[][] a = new double[n][n];
		long pos = 0; // Количество положительных элементов
		
		for (int i = 1; i <= n; i++) {
			long i2 = i * i;
			for (int j = 1; j <= n; j++) {
				double aij = Math.sin((i2 - j * j) / (double) n);
				a[i - 1][j - 1] = aij;
				if (aij > 0)
					pos++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		System.out.println(pos);
	}
}
