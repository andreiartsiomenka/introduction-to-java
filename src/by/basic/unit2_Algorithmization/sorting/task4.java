package by.basic.algorithmization.sorting;

import java.util.Scanner;

/*4. Сортировка обменами. Дана последовательность чисел .Требуется переставить числа в порядке возрастания.
 *  Для этого сравниваются два соседних числа . Если , то делается перестановка. 
 *  Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 *  Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + i);
			a[i] = in.nextLong();
		}

		long c = 0; // Количество перестановок
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 2; j >= i; j--)
				if (a[j] > a[j + 1]) {
					long t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					c++;
				}
		}
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n number of permutations " + c);
	}
}
