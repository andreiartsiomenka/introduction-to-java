package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 * */

public class task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n;) {
			int k = i + 1;
			for (int j = 0; j < n - i; j++) {
				a[i][j] = k;
			}
			i = k;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
