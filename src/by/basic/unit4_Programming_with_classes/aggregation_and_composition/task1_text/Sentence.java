package by.basic.programming_with_classes.aggregation_and_composition.task1_text;

public class Sentence {
private String sentence;

public Sentence(String sentence) {
	
	this.sentence = sentence;
}

@Override
public String toString() {
	return sentence;
}

public String getSentence() {
	return sentence;
}

public void setSentence(String sentence) {
	this.sentence = sentence;
}


}
