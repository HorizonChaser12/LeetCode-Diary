//https://leetcode.com/problems/make-the-string-great/description/?envType=daily-question&envId=2024-04-05
//A better solution can be made using stack and an advanced combination of string builder and simple ascii maths.
public class makeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));

    }

    static String makeGood(String s) {
        int i = 1;
        if (s.length()==1){
            return s;
        }
        StringBuilder ans = new StringBuilder(s);
        while (i < ans.length()) {
            s=ans.toString();
            checkGreat(ans, i);
            if (!ans.toString().equals(s)){
                i=1;
                continue;
            }
            i++;
        }
        return ans.toString();
    }
        private static void checkGreat(StringBuilder ans, int i){
            if (i==ans.length()+1 && (Math.abs(ans.charAt(i) - 'A' - (ans.charAt(i + 1) - 'A')) == 32)) {
                ans.delete(i, i + 2);
            } else if (Math.abs(ans.charAt(i) - 'A' - (ans.charAt(i - 1) - 'A')) == 32) {
                ans.delete(i-1, i+1);
            }
        }
}
