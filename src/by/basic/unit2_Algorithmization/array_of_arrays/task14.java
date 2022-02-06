package by.basic.algorithmization.array_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */
public class task14 {
	public static void main(String[] args) {
		Random random = new Random();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m, n");
		int m = in.nextInt();
		int n = in.nextInt();

		if (n > m) {
			System.out.println("Невозможно построить такую матрицу.");
			System.exit(1);
		}

		boolean[][] a = new boolean[m][n];
		for (int j = 0; j < n; j++) {
			int c = j + 1;
			while (c > 0) {

				int i = random.nextInt(m);
				if (!a[i][j]) {
					a[i][j] = true;
					c--;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((a[i][j] ? "1 " : "0 "));
			System.out.println();
		}
	}
}
