package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N.
 */

public class task10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		long n = in.nextLong();
		printDigits(getDigits(n));
	}

	/*
	 * Разложение на цифры по основанию 10
	 */
	static byte[] getDigits(long n) {
		byte[] result = new byte[(int) Math.log10(n) + 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = (byte) (n % 10);
			n = n / 10;
		}
		return result;
	}

	/*
	 * Вывод массива цифр
	 */
	static void printDigits(byte[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.print(digits[i] + " ");
		}
		System.out.println();
	}
}
