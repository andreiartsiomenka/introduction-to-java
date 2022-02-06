package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, 
 * у которых первый элемент больше последнего.
 * */

public class task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m, n:");
		int m = in.nextInt();
		int n = in.nextInt();
		long[][] a = new long[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i + " " + j);
				a[i][j] = in.nextLong();
			}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println();
		}

		for (int j = 0; j < n; j += 2) // Нумерация в матрице с 1 => j=0 - нечётный столбец
			if (a[0][j] > a[m - 1][j]) {
				for (int i = 0; i < m; i++)
					System.out.print(a[i][j] + " ");
				System.out.println();
			}
	}
}
