package by.basic.loop;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
*/
public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int sum = 0;
		int num = scanner.nextInt();
		for (; num > 0; num--) {
			sum = sum + num;
			System.out.println("Result :" + sum);
		}
		System.out.println("Result :" + sum);
		scanner.close();
	}

}
