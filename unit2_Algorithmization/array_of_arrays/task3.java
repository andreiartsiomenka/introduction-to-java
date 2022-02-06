package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;



/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * 
 * */
public class task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("m, n: ");
		int m = in.nextInt();
		int n = in.nextInt();
		long[][] a = new long[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i + " " + j);
				a[i][j] = in.nextLong();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("k :");
		int k = in.nextInt();
		for (int j = 0; j < n; j++) {
			System.out.print(a[k][j] + " ");
		}
		System.out.println();
		
		System.out.println("p :");
		int p = in.nextInt();
		for (int i = 0; i < m; i++) {
			System.out.print(a[i][p] + " ");
		}
		System.out.println();
	}
}
