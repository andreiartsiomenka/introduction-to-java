package by.basic.loop;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 * */
public class task3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("Sum of squares of the first hundred numbers : " + sum);
	}

}
