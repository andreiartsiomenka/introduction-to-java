package by.basic.unit1_basics_of_software_code_development.line_program;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long T;
		byte S, M;
		System.out.print("Введите длительность в секундах: ");
		T = in.nextLong();

		S = (byte) (T % 60);
		T = T / 60;

		M = (byte) (T % 60);
		T = T / 60;

		System.out.printf("%d ч %02d м %02d с \n", T, M, S);
	}
}
