package by.basic.unit1_basics_of_software_code_development.line_program;

import java.util.Scanner;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 */
public class task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i, f;
		System.out.print("Введите действительное число меньше 1000: ");
		float R = scanner.nextFloat();
		
		if (R >= 1000) {
			System.out.println("Ошибка: слишком большое число.");
			System.exit(1);
		}

		i = (int) R;
		f = (int) (R * 1000 % 1000);
		System.out.println(f + "." + i);
	}
}
