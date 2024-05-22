package Q10;

import java.util.HashMap;

public class MaximumOccurrence {
    public static void findMostOccurringWords(String text) {
        String[] words = text.split(" ");

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0)+1);
        }

        int maxFrequency = 0;
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Most occurring words in the string:");
        for (String word : wordFrequencyMap.keySet()) {
            if (wordFrequencyMap.get(word) == maxFrequency) {
                System.out.println(word + " - Frequency: " + maxFrequency);
            }
        }
    }

    public static void main(String[] args) {
        
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " + "Integer eget massa mauris. Sed nec ullamcorper purus, " + "eget laoreet felis. Sed consequat elit in feugiat ultricies. " + "Praesent vel sapien at magna vestibulum mollis at in ipsum. " + "Aenean in nunc id risus cursus venenatis. Pellentesque rutrum " + "sapien nec neque tincidunt, at consectetur nisi tristique.";

        findMostOccurringWords(text);
    }
}
