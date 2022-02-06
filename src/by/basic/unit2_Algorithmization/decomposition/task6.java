package by.basic.algorithmization.decomposition;

import java.util.Scanner;

/*
 * 6. Написать метод(методы), проверяющий, 
 * являются ли данные три числа взаимно простыми.
 * */
public class task6 {
	static Scanner in;


    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        System.out.println(mutuallySimple(a, b, c) ? "Yes" : "No");
    }


    /*
     * Являются ли a, b, c взаимно простыми?
     */
    static boolean mutuallySimple(long a, long b, long c) {
        return (greatestCommonDivisor(a, b) == 1)
               && (greatestCommonDivisor(b, c) == 1)
               && (greatestCommonDivisor(a, c) == 1);
    }


    /*
     * Бинарный алгоритм вычисления НОД
     */
    static long greatestCommonDivisor(long a, long b) {
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
