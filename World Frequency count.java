import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        // Define the sentence
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Convert the sentence to lowercase and split it into words
        String[] words = sentence.toLowerCase().split("\\W+");

        // Create a map to store the frequency of each word
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
