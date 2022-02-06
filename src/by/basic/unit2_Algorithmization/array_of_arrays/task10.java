package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 * */
public class task10 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter n :");
		int n = in.nextInt();

		double[][] a = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i + " " + j);
				a[i][j] = in.nextDouble();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			if (a[i][i] < 0) {
				System.out.print(a[i][i] + " ");}
			

		}

	}
}