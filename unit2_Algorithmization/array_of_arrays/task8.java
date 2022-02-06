package by.basic.algorithmization.array_of_arrays;


import java.util.Scanner;

/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, 
а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/
public class task8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m, n:");
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
		System.out.println("Enter p, q :");
		int p = in.nextInt() - 1;
		int q = in.nextInt() - 1;
		for (int i = 0; i < m; i++) {
			long t = a[i][p];
			a[i][p] = a[i][q];
			a[i][q] = t;
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}
