package by.basic.unit1_basics_of_software_code_development.branch;

import java.util.Scanner;

/*
 * 1. Даны два угла треугольника (в градусах). 
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
*/
public class t1_triangle {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

	    System.out.print("Введите угол А: ");
	    float A = Math.abs(in.nextFloat());

	    System.out.print("Введите угол B: ");
	    float B = Math.abs(in.nextFloat());

	    if ((A + B) >= 180) {
	      System.out.println("Такого треугольника не существует.");
	    } else
	      if ((A==90) || (B==90) || (A+B==90)) {
	        System.out.println("Это прямоугольный треугольник.");
	      } else {
	        System.out.println("Треугольник существует.");
	      }
	  }
}
