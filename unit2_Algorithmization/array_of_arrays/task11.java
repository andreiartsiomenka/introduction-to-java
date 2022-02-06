package by.basic.algorithmization.one_dimensional_array;

import java.util.Random;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
 *  Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
*/
public class task11 {
	public static void main(String[] args) {

		final byte M = 10;
		final byte N = 20;
		final byte MAX = 15;
		Random random = new Random();

		byte[][] a = new byte[M][N];
		byte[] fives = new byte[M]; // Количество пятёрок для каждой строки
		for (byte i = 0; i < M; i++) {
			byte fc = 0; // Счётчик пятёрок для текущей строки
			for (byte j = 0; j < N; j++) {
				byte aij = (byte) random.nextInt(MAX + 1);
				a[i][j] = aij;
				if (aij == 5)
					fc++;
			}
			fives[i] = fc;
		}

		for (byte i = 0; i < M; i++) {
			for (byte j = 0; j < N; j++)
				System.out.printf("%3d", a[i][j]);
			System.out.println();
		}
		System.out.print("String :");
		for (byte i = 0; i < M; i++)
			if (fives[i] > 2)
				System.out.print((i + 1) + " ");
		System.out.println();
	}
}
