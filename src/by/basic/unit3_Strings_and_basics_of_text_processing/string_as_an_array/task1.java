package by.basic.strings_and_basics_of_text_processing;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * */

public class task1 {

	public static void main(String[] args) {
		String[] camelCase = { "getChars", "equalsIgnoreCase", "toLowerCase", "toUpperCase", "toCharArray", "charAt" };
		String[] snakeCase = toSnakeCase(camelCase);

		System.out.println(String.join(", ", camelCase));
		System.out.println(String.join(", ", snakeCase));
	}



	private static String[] toSnakeCase(String[] camelCase) {
		String[] snakeCase = new String[camelCase.length];
		for (int i = 0; i < snakeCase.length; i++) {
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 0; j < camelCase[i].length(); j++) {
				char letter = camelCase[i].toCharArray()[j];
				if (Character.isLowerCase(letter)) {
					strBuilder.append(letter);
				} else {
					strBuilder.append("_");
					strBuilder.append(Character.toLowerCase(letter));
				}
			}
			snakeCase[i] = strBuilder.toString();
		}
		return snakeCase;
	}
}
