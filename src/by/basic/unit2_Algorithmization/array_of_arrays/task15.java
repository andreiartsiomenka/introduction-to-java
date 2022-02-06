package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * 
 * */
public class task15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m, n:");
		int m = in.nextInt();
		int n = in.nextInt();
		long[][] a = new long[m][n];
		long max = Long.MIN_VALUE;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i + " " + j);
				long aij = in.nextLong();
				a[i][j] = aij;
				if (aij > max) {
					max = aij;
				}
			}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				long aij = a[i][j];
				if ((aij & 1) == 1) {
					aij = max;
					a[i][j] = aij;
				}
				System.out.print(aij + " ");
			}
			System.out.println();
		}
	}
}
