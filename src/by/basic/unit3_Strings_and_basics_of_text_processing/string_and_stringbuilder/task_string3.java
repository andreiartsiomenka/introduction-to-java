package by.basic.strings_and_basics_of_text_processing;



/*
 * 3. Проверить, является ли заданное слово палиндромом.
 * 
 * */
public class task_string3 {
	public static void main(String[] args) {
		 String [] words = {"palindrome", "madam", "level", "referee", "Stanley Yelnats"};
	        for (String word : words) {
	            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
	            System.out.println(word + result);
	        }
	}
	private static boolean isPalindrome (String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            String a = String.valueOf(word.charAt(i));
            String b = String.valueOf(word.charAt(word.length() - i - 1));
            if (!a.equalsIgnoreCase(b)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
