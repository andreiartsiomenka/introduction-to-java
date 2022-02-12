package by.basic.unit1_basics_of_software_code_development.line_program;

import java.util.Scanner;

/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
 *  
 *  */
public class task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double x = 0;
		double y = 0;

		System.out.print("Input a number x ,y : ");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("type not double");
		}
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		
		System.out.printf("x=%f; y=%f \n", x, y);
		
		double Result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("Result= " + Result);
	}
}
