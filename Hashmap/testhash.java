package Hashmap;
public class testhash {
    public static void main(String[] args) {
        // Example sentence
        String sentence = "This is  an example   sentence.";

        // Split the sentence into words using whitespace as a delimiter
        String[] words = sentence.split("\\s+");

        // Print each word in the resulting array
        for (String word : words) {
            System.out.println(word);
        }
    }
} 