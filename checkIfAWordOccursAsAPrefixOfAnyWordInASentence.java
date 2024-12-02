//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=daily-question&envId=2024-12-02
public class checkIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public static void main(String[] args) {
        String sentence = "hello from the other side", searchWord = "they";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }
    static int isPrefixOfWord(String sentence, String searchWord) {
        String[] string1 = sentence.split(" ");
        for (int i = 0; i < string1.length; i++) {
            if (string1[i].length() >= searchWord.length()) {
                for (int j = 0; j < searchWord.length(); j++) {
                    if (string1[i].charAt(j) != searchWord.charAt(j)) {
                        break;
                    } else if (j == searchWord.length() - 1) {
                        return i + 1;
                    }
                }
            }
        }
        return -1;
    }
}
