package siva05.jse.highlevel.interview;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void findDuplicateWords(String inputString) {

		String[] words = inputString.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println("Repeated Words---> "+word + " :: " + wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {

		DuplicateWordsInString.findDuplicateWords("Hello sathya and sathya");
		DuplicateWordsInString.findDuplicateWords("Java is java again java");
		DuplicateWordsInString.findDuplicateWords("Super Man Bat Man Spider Man");

	}

}
