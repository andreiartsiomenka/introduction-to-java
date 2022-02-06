package by.basic.strings_and_basics_of_text_processing;

/*
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 * 
 *  Определить количество предложений в строке X.*/
public class task_string10 {
	private static int countSentences (String line) {
        int counter = 1;
        char [] marks = {'.', '!', '?'};
        for (int i = 0; i < line.length() - 1; i++) {
            char character = line.charAt(i);
            for (char mark : marks) {
                if (character == mark && (line.charAt(i + 1) == ' ' || line.charAt(i + 1) == 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String lineX = "Abstract class for reading character streams."
        		+ " The only methods that a subclass must implement are read(char[], int, int) and close()."
        		+ " Most subclasses, however, will override some of the methods defined here in order to provide higher efficiency, additional functionality, or both.";

        System.out.println("Number of sentences per line: " + countSentences(lineX));
    }
}
