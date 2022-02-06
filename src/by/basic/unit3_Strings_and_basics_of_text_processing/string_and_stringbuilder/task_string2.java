package by.basic.strings_and_basics_of_text_processing;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 * 
 * */
import java.util.Scanner;

public class task_string2 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in).useDelimiter("\n");
    String s = in.next().replace("a", "ab");
    System.out.println(s);
}
}
