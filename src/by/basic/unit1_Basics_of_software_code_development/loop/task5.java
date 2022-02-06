package by.basic.loop;

import java.util.Scanner;

/*
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен
 *заданному е.
*/
public class task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//проверки потока на double
		System.out.println("e >> ");
		double e = scanner.nextDouble();
		System.out.println("n >> ");
		int n = scanner.nextInt();
		
		double sum = 0.0;
		double an = 0.0;
		

		for (int i = 0; i <= n; i++) {
			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}

		System.out.println("Сумма равна " + sum);
	}
}
