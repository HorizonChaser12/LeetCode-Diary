//https://leetcode.com/problems/longest-happy-string/description/
public class longestHappyString {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 7;
        System.out.println(longestDiverseString(a,b,c));
    }

    static String longestDiverseString(int a, int b, int c) {
//      Logic and solution from the below solution without using heap.
//      https://leetcode.com/problems/longest-happy-string/solutions/5919175/understand-greed-once-beats-100-with-added-youtube-video/
        int maxLen = a + b + c;
        int A = 0, B = 0, C = 0;
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < maxLen) {
            if ((A != 2 && a >= b && a >= c) || a > 0 && (B == 2 || C == 2)) {
                str.append('a');
                A++;
                B = 0;
                C = 0;
                a--;
            } else if ((B != 2 && b >= a && b >= c) || b > 0 && (A == 2 || C == 2)) {
                str.append('b');
                B++;
                A = 0;
                C = 0;
                b--;
            }
            else if  ((C != 2 && c >= a && c >= b) || c > 0 && (A == 2 || B == 2)){
                str.append('c');
                C++;
                A = 0;
                B = 0;
                c--;
            }
            i++;
        }
        return str.toString();
    }
}
