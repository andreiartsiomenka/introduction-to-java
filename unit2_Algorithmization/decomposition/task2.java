package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * */
public class task2 {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter a, b, c, d:");
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		System.out.println("lowest common multiple :" + lowestCommonMultiple(a, b, c, d));
	}

	/*
	 * НОД четырёх чисел
	 */
	static long lowestCommonMultiple(long a, long b, long c, long d) {
		return greatestCommonDivisor(a, greatestCommonDivisor(b, greatestCommonDivisor(c, d)));
	}

	/*
	 * Бинарный алгоритм вычисления НОД
	 */
	static long greatestCommonDivisor(long a, long b) {
		if (a == b) {
			return a;
		}
		int rol = 0; // Требуемый сдвиг результата
		while ((a > 1) && (b > 1) && ((a & 1) == 0) && ((b & 1) == 0)) {
			a = a >> 1;
			b = b >> 1;
			rol++;
		}
		while ((a > 0) && (b > 0)) {
			if (a == b) {
				return a << rol;
			}
			while ((a > 1) && ((a & 1) == 0)) {
				a = a >> 1;
			}
			while ((b > 1) && ((b & 1) == 0)) {
				b = b >> 1;
			}
			if (b > a) {
				long t = a;
				a = b;
				b = t;
			}
			a = (a - b) >> 1;
		}
		if (a == 0) {
			return b << rol;
		} else {
			return a << rol;
		}
	}
}
