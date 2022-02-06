package by.basic.algorithmization.one_dimensional_array;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn .
 *  Поменять местами наибольший и наименьший элементы.
 *  
 *  */
public class task4 {
	public static void main(String[] args) {

		double[] array = new double[10];
		int minIndex = 0;
		int maxIndex = 0;
		double min;
		double max;

		min = array[0];
		max = array[0];

		for (int i = 1; i < array.length; i++) {
			array[i] = (int) (Math.random() * 30);
			System.out.print(array[i] + " ");

			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			} else if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}

		double temp = array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;
		System.out.println("New array :");
		for (int i = 1; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}
	}
}
