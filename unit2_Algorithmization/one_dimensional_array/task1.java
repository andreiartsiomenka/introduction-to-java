package by.basic.algorithmization.one_dimensional_array;

/*
 * 1. В массив A [N] занесены натуральные числа.
 *  Найти сумму тех элементов, которые кратны данному К.
 *  
 *  */
public class task1 {
	public static void main(String[] args) {

		int k = 2;
		int[] a = new int[10];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 32);
			System.out.print(a[i] + " ");

			if (a[i] % k == 0) {
				sum += a[i];
			}
		}

		System.out.println("\n The sum of elements that are multiples " + k + ", is equal " + sum);
		System.out.println();
	}
}
