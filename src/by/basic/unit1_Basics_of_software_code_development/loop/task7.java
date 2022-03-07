package by.basic.loop;

import java.util.Iterator;
import java.util.Scanner;

import com.sun.security.auth.NTDomainPrincipal;

/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 *	m и n вводятся с клавиатуры.
*/
public class task7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("m >> ");
		int m = scanner.nextInt();
		System.out.println("n >> ");
		int n = scanner.nextInt();
		System.out.println("The number of dividers is not less than ...(Количество делителей не менее...)");
		int number = scanner.nextInt();
		while (m<n) {
			int mod = 0;
			for (int i = 0;i<m;i++) {
				if(m%i == 0) {
					mod+=1;
				}
				}
			if(mod>=number) {
				System.out.printf("%d - %d - ", m, mod);
				for (int i = 0;i<m;i++) {
					if(m%i==0) {
						System.out.printf("%d ",i);
						System.out.println();
					}
					
				}
			}
			m+=1;
		}
		    
		}
}
