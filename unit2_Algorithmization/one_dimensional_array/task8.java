package by.basic.algorithmization.one_dimensional_array;

import java.util.Scanner;

/*
 * 8. Дана последовательность целых чисел n a ,a , ,a 1 2  .
 *  Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ) 1 2 n a a  a .
*/
public class task8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int min = 0; // Индекс минимального элемента
		int c = 0;// Количество выбрасываемых элементов
		System.out.println("array elements :");
		int n = in.nextInt();
		long[] a_in = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + i);
			a_in[i] = in.nextLong();
			if (a_in[i] == a_in[min]) {
				c++;
			} else if (a_in[i] < a_in[min]) {
				c = 1;
				min = i;
			}
		}
		long[] a_out = new long[n - c];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a_in[i] == a_in[min])
				continue;
			a_out[j] = a_in[i];
			System.out.print(a_out[j++] + " ");
		}
		System.out.println();
	}
}
