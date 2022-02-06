package by.basic.algorithmization.one_dimensional_array;

/*
 * 3. Дан массив действительных чисел, размерность которого N.
 *  Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class task3 {
	
public static void main(String[] args) {
	
	
    double[] array = new double[10];
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    

    for (int i = 0; i < array.length; i++) {
    	array[i] = (int) ((Math.random() * 30)-15);
		System.out.print(array[i] + " ");
        if (array[i] > 0) {
            positiveCount++;
        } else if (array[i] == 0) {
            zeroCount++;
        } else {
            negativeCount++;
        }
    }

    System.out.println("\n In an array " + positiveCount + " positive , " + negativeCount + " negative and " + zeroCount + " zero elements");
    System.out.println();
}
}

