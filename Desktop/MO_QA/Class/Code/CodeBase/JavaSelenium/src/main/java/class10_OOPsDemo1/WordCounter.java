package class10_OOPsDemo1;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Call the countWords method to get the word count
        int wordCount = countWords(inputSentence);

        // Display the result
        System.out.println("Number of words = " + wordCount);
    }

    // Method to count the number of words in a sentence without using wrapper classes
    private static int countWords(String sentence) {
        int wordCount = 0;
        boolean isWord = false;

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // Check if the character is a whitespace character
            if (currentChar == ' ' || currentChar == '\t' || currentChar == '\n' || currentChar == '\r') {
                // If the previous character was part of a word, increment the word count
                if (isWord) {
                    wordCount++;
                    isWord = false;
                }
            } else {
                // If the character is not a whitespace character, set inWord to true
            	isWord = true;

                // If this is the last character in the sentence, increment the word count
                if (i == sentence.length() - 1) {
                    wordCount++;
                }
            }
        }

        return wordCount;
    }
}
