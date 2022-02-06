package by.basic.strings_and_basics_of_text_processing;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/
public class task_string7 {
	private static String removeReplays(String line) {
		StringBuilder strBuilder = new StringBuilder(line);
		for (int i = 0; i < strBuilder.length(); i++) {
			char ch = strBuilder.charAt(i);

			/* удаляем пробелы */
			if (ch == ' ') {
				strBuilder.deleteCharAt(i);
				i--;
				continue;
			}

			/* удаляем повторяющиеся символы */
			for (int j = i + 1; j < strBuilder.length(); j++) {
				if (strBuilder.charAt(j) == ch) {
					strBuilder.deleteCharAt(j);
				}
			}
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String line = "Constructs a new String by decoding the specified subarray of bytes using the platform's default charset. "
				+ "The length of the new String is a function of the charset, "
				+ "and hence may not be equal to the length of the subarray.";
		System.out.println(removeReplays(line));
	}
}
