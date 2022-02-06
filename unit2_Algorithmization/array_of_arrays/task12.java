package by.basic.algorithmization.one_dimensional_array;

import java.util.Scanner;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 * 
 * */
public class task12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m, n:");
		int m = in.nextInt();
		int n = in.nextInt();
		long[][] a = new long[m][n];
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.println("Element " + i +" "+ j);
				a[i][j] = in.nextLong();
			}

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n - 1; j++)
				for (int k = j; k < n; k++)
					if (a[i][k] < a[i][j]) {
						long t = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = t;
					}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n - 1; j++)
				for (int k = j; k < n; k++)
					if (a[i][k] > a[i][j]) {
						long t = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = t;
					}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	
	}

	
}
