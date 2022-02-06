package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * */

public class task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter n(n - even):");
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int j = 0; j < n;) {
			a[0][j] = ++j;
			a[1][n - j] = j;
		}
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 2];
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
