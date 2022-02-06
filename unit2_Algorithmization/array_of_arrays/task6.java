package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * */
public class task6 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i <= n / 2; i++) {
			for (int j = i; j < n - i; j++) {
				a[i][j] = 1;
			}
		}
		for (int i = n / 2; i < n; i++) {
			a[i] = a[n - i - 1];
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
