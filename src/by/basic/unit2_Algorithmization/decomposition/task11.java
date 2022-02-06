package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * 
 * */
public class task11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b:");
		long a = in.nextLong();
		long b = in.nextLong();
		System.out.println("more " + moreDigits(a, b));
	}

	/*
	 * Нахождение большего по модулю числа
	 */
	static long moreDigits(long a, long b) {
		return Math.abs(a) > Math.abs(b) ? a : b;
	}
}
