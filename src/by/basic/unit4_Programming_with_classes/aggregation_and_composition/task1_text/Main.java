package by.basic.programming_with_classes.aggregation_and_composition.task1_text;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/

public class Main {
	public static void main(String[] args) {
        Word heading = new Word("public interface Collection<E>\n");
        String line1 = "The root interface in the collection hierarchy. "
        		+ "A collection represents a group of objects, known as its elements. "
        		+ "Some collections allow duplicate elements and others do not. "
        		+ "Some are ordered and others unordered. \n";
        Sentence sentence = new Sentence(line1);
        Text poem = new Text(heading, sentence);

        String line2 = "The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List."
        		+ " This interface is typically used to pass collections around and manipulate them where maximum generality is desired. \n";
        String line3 = "All general-purpose Collection implementation classes (which typically implement Collection "
        		+ "indirectly through one of its subinterfaces) should provide two \"standard\" constructors: a void (no arguments) constructor, which creates an empty collection,"
        		+ " and a constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument."
        		+ " In effect, the latter constructor allows the user to copy any collection, producing an equivalent collection of the desired implementation type."
        		+ " There is no way to enforce this convention (as interfaces cannot contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply. \n";
        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));

        poem.printText();
        poem.printHeading();
    }
}
