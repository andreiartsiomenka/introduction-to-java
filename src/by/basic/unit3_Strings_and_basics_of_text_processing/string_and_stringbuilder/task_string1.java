package by.basic.strings_and_basics_of_text_processing;

import java.util.Scanner;

/*
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 * */

public class task_string1 {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in).useDelimiter("\n");
        String s = in.next();
        int spaces = 0;
        int maxSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) == ' ') {
                spaces++;                                   
                if (spaces > maxSpaces) maxSpaces = spaces;
            } else {
                spaces = 0;
            }
        }
        System.out.println(maxSpaces);
    }
}
