package by.basic.strings_and_basics_of_text_processing;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды
 * 
 * */
public class task_string6 {

	private static String repeatCharacter(String line, int factor) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			for (int j = 0; j < factor; j++) {
				strBuilder.append(line.charAt(i));
			}
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String line = "watsap viber";
		System.out.println(repeatCharacter(line, 2));
	}
}
