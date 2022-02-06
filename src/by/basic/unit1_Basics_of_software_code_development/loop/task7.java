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
		//Проверка 
		
		System.out.println("m >> ");
		int m = scanner.nextInt();
		System.out.println("n >> ");
		int n = scanner.nextInt();
		    //a,b,n,m,i: word;<br>
		 //<br>
		//begin<br>
		    //write('Числовой промежуток: ');<br>
		
		    //readln(a,b);<br>
		System.out.println("The number of dividers is not less than ...");
		    //write('Количество делителей не менее... ');<br>
		    //readln(n);<br>
		int number = scanner.nextInt();
		
		    //while a <= b do begin<br>
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
		        //m := 0;<br>
		        //for i:=1 to a do<br>
		            //if a mod i = 0 then m := m + 1;<br>
		        //if m >= n then begin<br>
		            //write(a,' - ', m,' - ');<br>
		            //for i:=1 to a do<br>
		                //if a mod i = 0 then write(i,' ');<br>
		            //writeln;<br>
		        //end;<br>
		        //a := a + 1;<br>
		    
		
	}
}
