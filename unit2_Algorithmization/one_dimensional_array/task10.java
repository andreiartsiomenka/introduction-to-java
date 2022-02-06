package by.basic.algorithmization.one_dimensional_array;

import java.util.Scanner;

/*
 * 10. Дан целочисленный массив с количеством элементов п.
 *  Сжать массив, выбросив из него каждый второй
*элемент (освободившиеся элементы заполнить нулями).
 *Примечание. Дополнительный массив не использовать.
*/
public class task10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Array elements :");
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + i);
			a[i] = in.nextLong();
		}

		for (int i = 1; i < n; i += 2) {
			a[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
