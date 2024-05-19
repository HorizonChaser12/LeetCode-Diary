//https://leetcode.com/problems/score-of-a-string/
public class scoreOfAString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
    static int scoreOfString(String s) {
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score = score + Math.abs((s.charAt(i))-(s.charAt(i + 1)));
        }
        return score;
    }
}
