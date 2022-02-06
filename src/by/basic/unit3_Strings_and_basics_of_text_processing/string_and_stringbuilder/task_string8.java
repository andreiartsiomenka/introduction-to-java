package by.basic.strings_and_basics_of_text_processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/
public class task_string8 {
	private static String findLongestWord (String line) {
        String longestWord = "";
        int maxLenght = 0;
        String [] words = line.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(findLongestWord(line));
    }
}
