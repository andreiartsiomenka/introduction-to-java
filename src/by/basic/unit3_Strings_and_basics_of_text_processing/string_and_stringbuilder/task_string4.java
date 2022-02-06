package by.basic.strings_and_basics_of_text_processing;

/*
 * 4. С помощью функции копирования и операции конкатенации 
 * составить из частей слова “информатика” слово “торт”.
 *
 * */
public class task_string4 {
	private static String makeWord(String word) {
		String cake = String.valueOf(word.charAt(word.indexOf('т')));
		//System.out.println(cake);
		cake += String.valueOf(word.charAt(word.indexOf('о')));
		//System.out.println(cake);
		cake += String.valueOf(word.charAt(word.indexOf('р')));
		//System.out.println(cake);
		cake += String.valueOf(word.charAt(word.indexOf('т')));
		//System.out.println(cake);
		return cake;
	}

	public static void main(String[] args) {
		String informatics = "информатика";
		System.out.println(makeWord(informatics));
	}
}
