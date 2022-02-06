package by.basic.strings_and_basics_of_text_processing;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * 
 * */
public class task_string5 {
	private static int countCharacter(String line, char ch) {
		int counter = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String line = "The String class represents character strings."
				+ " All string literals in Java programs, such as \"abc\", are implemented as instances of this class.\r\n"
				+ "Strings are constant; their values cannot be changed after they are created."
				+ "String buffers support mutable strings. Because String objects are immutable they can be shared.";
		System.out.println(countCharacter(line, 'a'));
	}
}
