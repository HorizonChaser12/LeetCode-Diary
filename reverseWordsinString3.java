//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class reverseWordsinString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
      String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        if (result.length() > 0) {
            result.append(' '); // Add a space between words
        }

        result.append(charArray);
    }

    return result.toString();
    }
}
