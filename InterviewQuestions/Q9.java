package InterviewQuestions;
//write a function that takes in a string of lower case English alphabet letters and returns the index of the string's first non repeating character. The first non repeating character is the first character in the string that occurs only ones. If the input string does not have a non repeating character, the function should return -1
//        example:
//        input : abcdcaf
//        output : 1
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        String str= "abcdcafaaaa";
        System.out.println(sample(str));
    }
    static int sample(String str){
        int[] alpha = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[str.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

}
