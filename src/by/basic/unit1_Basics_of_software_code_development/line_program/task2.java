package by.basic.unit1_basics_of_software_code_development.line_program;

import java.util.Scanner;

/*
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
*	((𝑏+√𝑏2+4𝑎𝑐)/2𝑎)−𝑎3𝑐+𝑏−2
*/
public class task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;

        System.out.print("Input a number a ,b ,c: ");
        while (!scanner.hasNextFloat()){
            scanner.nextLine();
            System.out.println("type not floate");
        }
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        System.out.printf("a=%f; b=%f; c=%f \n", a, b, c);

		float z = (float) (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c
				+ Math.pow(b, -2));

		System.out.printf("Result = %f", z);
		
	}
}
