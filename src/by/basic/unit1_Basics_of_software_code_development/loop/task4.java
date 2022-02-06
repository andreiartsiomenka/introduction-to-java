package by.basic.loop;

import java.math.BigInteger;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 * */
public class task4 {
	public static void main(String[] args) {
		BigInteger composition = new BigInteger("1");
		BigInteger result = new BigInteger("1");
		
		for (int i = 1; i <= 200; i++) {
			BigInteger in = null;
			result = result.multiply(composition.multiply(in.valueOf(i*i)));
		}
		
		System.out.println("Products of the squares of the first two hundred numbers :" + result);
	}
}
