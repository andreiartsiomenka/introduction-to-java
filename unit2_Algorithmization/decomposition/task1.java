package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
*/
public class task1 {
	static Scanner in;


    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Enter a, b ");
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println("greatest common divisor: "+greatestCommonDivisor(a, b) +
        		" lowestCommonMultiple: " + lowestCommonMultiple(a, b));
    }


    /*
     * НОК
     */
    static long lowestCommonMultiple(long a, long b) {
        return a * b / greatestCommonDivisor(a, b);
    }


    /*
     * Бинарный алгоритм вычисления НОД
     */
    static long  greatestCommonDivisor(long a, long b) {
        if (a == b) {
            return a;
        }
        int rol = 0; //Требуемый сдвиг результата
        while ((a > 1) && (b > 1) && ((a & 1) == 0) && ((b & 1) == 0)) {
            a = a >> 1;
            b = b >> 1;
            rol++;
        }
        while ((a > 0) && (b > 0)) {
            if (a == b) {
                return a << rol;
            }
            while ((a > 1) && ((a & 1) == 0)) {
                a = a >> 1;
            } 
            while ((b > 1) && ((b & 1) == 0)) {
                b = b >> 1;
            }
            if (b > a) {
                long t = a;
                a = b;
                b = t;
            }
            a = (a - b) >> 1;
        }
        if (a == 0) {
            return b << rol;
        } else
        {
            return a << rol;
        }
    }
}
