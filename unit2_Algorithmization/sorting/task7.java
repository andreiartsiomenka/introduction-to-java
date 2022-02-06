package by.basic.algorithmization.sorting;

import java.util.Scanner;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел  .
Требуется указать те места, на которые нужно вставлять элементы последовательности  в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
*/
public class task7 {
	 static Scanner in;


	    public static void main(String[] args) {
	        in = new Scanner(System.in);

	        double[] a = arrayIn();
	        double[] b = arrayIn();

	        int i = 0; double ai = a[i];
	        int j = 0; double bj = b[j];
	        int k = 0; //Счётчик искомых позиций
	        while (k < a.length + b.length) {
	            k++;
	            if (bj < ai) {
	                System.out.print(k + " ");
	                j++;
	                if (j < b.length) {
	                    bj = b[j];
	                } else {
	                    bj = Double.MAX_VALUE;
	                }
	            } else {
	                i++;
	                if (i < a.length) {
	                    ai = a[i];
	                } else {
	                    ai = Double.MAX_VALUE;
	                }
	            }
	        }
	        System.out.println();
	    }


	    /*
	     * Ввод массива
	     */
	    static double[] arrayIn() {
	    	System.out.println("Enter n:");
	      int n = in.nextInt();
	      double[] Result = new double[n];
	      for (int i = 0; i < n; i++) {
	    	  System.out.println("Element " + i);
	          Result[i] = in.nextDouble();
	      }
	      return Result;
	    }
}
