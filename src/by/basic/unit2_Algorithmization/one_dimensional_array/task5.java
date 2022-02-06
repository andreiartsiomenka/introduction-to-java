package by.basic.algorithmization.one_dimensional_array;

/*5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/
public class task5 {
	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 30) - 15);
			System.out.print(array[i] + " ");

		}

		System.out.println("\n The numbers for which а[i] > i: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println("ar[" + i + "] = " + array[i]);
			}
		}

		System.out.println();
	}

}
