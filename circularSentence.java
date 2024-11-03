//https://leetcode.com/problems/circular-sentence/description/
public class circularSentence {
    public static void main(String[] args) {
        String sentence = "MuFoevIXCZzrpXeRmTssj lYSW U jM";
        System.out.println(isCircularSentence(sentence));
    }
    static boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length-1; i++) {
            if (str[i].charAt(str[i].length()-1)!=str[i+1].charAt(0)){
                return false;
            }
        }
        return true;
    }
}
