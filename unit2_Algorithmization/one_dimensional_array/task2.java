package by.basic.algorithmization.one_dimensional_array;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 *  Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
*/

public class task2 {
	public static void main(String[] args) {

		int[] array = new int[10];
		int z = 11;
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 34);
			System.out.print(array[i] + " ");
			if (array[i] > z) {
				array[i] = z;
				j++;
			}
		}
		System.out.print("\n New array :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println("\n Exchange :" + j);

	}
}
