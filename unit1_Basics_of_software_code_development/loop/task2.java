package by.basic.loop;

import java.util.Scanner;

/*
 * 2.Вычислить значения функции на отрезке [а,b] c шагом h:
 * 
 * */
public class task2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a ");
	int a = scanner.nextInt();
	System.out.println("Enter b ");
	int b = scanner.nextInt();
	System.out.println("Enter h ");
	int h = scanner.nextInt();
	
    int y = 0;

    for (int i = a; i <= b; i += h) {
        if (i > 2) {
            y = i;
        } else {
            y = i * (-1);
        }
        System.out.println("При х = " + i + " у = " + y);
	scanner.close();
    }
}
}

