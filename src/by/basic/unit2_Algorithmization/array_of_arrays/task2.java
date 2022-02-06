package by.basic.algorithmization.array_of_arrays;

import java.util.Scanner;

/*
 * 2. Дана квадратная матрица. 
 * Вывести на экран элементы, стоящие на диагонали.
 * */
public class task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i + " " + j);
				a[i][j] = in.nextLong();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			{
				System.out.print(a[i][i] + " ");
			}
			System.out.println();
		}
	}
}
