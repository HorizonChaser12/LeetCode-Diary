import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/contest/weekly-contest-420/problems/find-the-sequence-of-strings-appeared-on-the-screen/description/
public class findTheSequenceOfStringsAppearedOnTheScreen {
    public static void main(String[] args) {
        String target = "he";
        System.out.println(stringSequence(target));

    }
    static List<String> stringSequence(String target) {
//      This is a copied code,I couldn't find an actual logic because of certain criteria ,And now I did get all those logic.
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        // Start with an initial character 'a' on the screen
        current.append('a');
        result.add(current.toString());

        // Iterate through each character in the target string
        for (int i = 0; i < target.length(); i++) {
            char targetChar = target.charAt(i);

            // Add 'a' for the next character if needed
            if (current.length() < i + 1) {
                current.append('a');
                result.add(current.toString());
            }

            // Increment the last character until it matches the target character
            while (current.charAt(current.length() - 1) != targetChar) {
                char newChar = (char) (current.charAt(current.length() - 1) + 1);
                current.setCharAt(current.length() - 1, newChar);
                result.add(current.toString());
            }

            // If not the last character, add an 'a' to prepare for the next
            if (i < target.length() - 1) {
                current.append('a');
                result.add(current.toString());
            }
        }

        return result;

    }
}
