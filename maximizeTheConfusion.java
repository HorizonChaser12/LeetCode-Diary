//https://leetcode.com/problems/maximize-the-confusion-of-an-exam/
public class maximizeTheConfusion {
    public static void main(String[] args) {
        String str="TTFF";
        System.out.println(maxConsecutiveAnswers(str,2));
    }
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        char[] char1 = answerKey.toCharArray();
        int countT=0;
        int countF=0;
        for (int i = 0; i < answerKey.length(); i++) {

        }
        while (k > 0) {
        for (int i = 0; i < char1.length; i++) {
                if (char1[i] == 'F') {
                    char1[i] = 'T';
                    countT++;
                    k--;
                }
                else if (char1[i] == 'T') {
                    char1[i] = 'F';
                    countF++;
                    k--;
                }
            }
        }
        return Math.max(countT, countF);
    }
}
