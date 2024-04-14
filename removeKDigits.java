//https://leetcode.com/problems/remove-k-digits/description/?envType=daily-question&envId=2024-04-11
public class removeKDigits {
    public static void main(String[] args) {
        String s = "1234567890";
        int k = 9;
        System.out.println(removeKdigits(s,k));
    }
    static String removeKdigits(String num, int k) {
//       Passes 35/49 test cases. This question's edge cases are so bad. Spent nearly 2hr+ and still stuck at some large ass edge case and thus leaving it there and moving on.
//        StringBuilder ans = new StringBuilder(num);
//        if (num.length()==k){
//            return "0";
//        }
//        int i=0;
//        while(i<ans.length() && k>0){
//            if (i==ans.length()-1){
//                if (ans.charAt(i-1) <= ans.charAt(i)){
//                    ans.delete(i,i+1);
//                    k--;
//                }
//                break;
//            }
//            if (ans.charAt(i)>ans.charAt(i+1)){
//                ans.delete(i,i+1);
//                k--;
//                if (i>0 && ans.charAt(i-1) <= ans.charAt(i) && k>0){
//                    ans.delete(i,i+1);
//                    k--;
//                }
//                i--;
//            }
//            i++;
//        }
//        int j=0;
//        int m=ans.length()-1;
//        while (k>0 && m>=0){
//            if (m==0){
//                ans.delete(m,m+1);
//                break;
//            }
//            if (ans.charAt(m)>=ans.charAt(m-1)){
//                ans.delete(m,m+1);
//                k--;
//            }
//            m--;
//
//        }
//        while(!ans.isEmpty() && ans.charAt(j)=='0'){
//                ans.delete(0,1);
//        }
//        return ans.isEmpty() ? "0" : ans.toString();

//      This is the solution without the use of stack that got accepted. Got to learn the intuition and logic behind it.
        StringBuilder s = new StringBuilder();
        s.append(num.charAt(0));
        for (int i = 1; i < num.length(); ++i) {
            if (k > 0 && s.length() > 0 && num.charAt(i) < s.charAt(s.length() - 1)) {
                s.deleteCharAt(s.length() - 1);
                k--;
                i--;
                continue;
            }
            s.append(num.charAt(i));
        }
        while (k > 0 && s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
            k--;
        }
        while (s.length() > 0 && s.charAt(0) == '0') {
            s.deleteCharAt(0);
        }
        if (s.length() == 0) {
            s.append('0');
        }
        return s.toString();
    }
}
