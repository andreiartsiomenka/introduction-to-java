package by.basic.algorithmization.sorting;

import java.util.Scanner;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
 * при этом не используя дополнительный массив.
*/
public class task1 {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		long[] a = nextArray();
		long[] b = nextArray();
		System.out.println("Enter k: ");
		int k = in.nextInt();
		if ((k > a.length) || (k < 0)) {
			System.out.println("Ошибка: выход за пределы первого массива.");
			System.exit(1);
		}

		int i = 0;
		while (i < k)
			System.out.print(a[i++] + " ");
		for (i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		for (i = k; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	static long[] nextArray() {
		System.out.println("Enter n: ");
		int n = in.nextInt();
		long[] Result = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + i);
			Result[i] = in.nextLong();
		}
		return Result;
	}
}