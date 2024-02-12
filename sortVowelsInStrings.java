import java.util.Arrays;

public class sortVowelsInStrings {
    public static void main(String[] args) {
        // Input string
        String s = "eat";

        // Initialize variables to store vowels and their positions
        StringBuilder vowels = new StringBuilder();
        StringBuilder result = new StringBuilder(s);
        int[] vowelPositions = new int[s.length()]; // To store positions of vowels

        int vowelCount = 0; // Keep track of the number of vowels found

        // Iterate through the string to collect vowels and their positions
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if ("aeiou".contains(String.valueOf(currentChar))) {
                vowels.append(currentChar);
                vowelPositions[vowelCount] = i;
                vowelCount++;
            }
        }

        // Sort the vowels
        char[] sortedVowels = vowels.toString().toCharArray();
        Arrays.sort(sortedVowels);

        // Reconstruct the string with sorted vowels and original consonants
        for (int i = 0; i < vowelCount; i++) {
            result.setCharAt(vowelPositions[i], sortedVowels[i]);
        }

        System.out.println(result);
    }
}
