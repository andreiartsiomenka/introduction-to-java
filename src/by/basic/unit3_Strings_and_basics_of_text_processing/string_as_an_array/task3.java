package by.basic.strings_and_basics_of_text_processing;

import java.util.Scanner;

/*
 * 3. В строке найти количество цифр.
 * 
 * */
public class task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in).useDelimiter("\n");
		char[] s = in.next().toCharArray();
		int digits = 0; // Количество найденных цифр
		for (int i = 0; i < s.length; i++) {
			if (Character.isDigit(s[i]))
				digits++;
		}
		System.out.println(digits);
	}
}
