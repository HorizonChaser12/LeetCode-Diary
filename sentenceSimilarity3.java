//https://leetcode.com/problems/sentence-similarity-iii/description/?envType=daily-question&envId=2024-10-06
public class sentenceSimilarity3 {
    public static void main(String[] args) {
        String str1 = "of";
        String str2 = "A lot of words";
        System.out.println(areSentencesSimilar(str1, str2));
    }

    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");
        if (sentence1.equals(sentence2)){
            return true;
        }
        int left = 0;
        int right1 = str1.length - 1;
        int right2 = str2.length - 1;
        while (left < str1.length && left < str2.length && str1[left].equals(str2[left])) {
            left++;
        }
        while (right1 >= left && right2 >= left && str1[right1].equals(str2[right2])) {
            right1--;
            right2--;
        }
        return left > right1 || left > right2;
    }
}
