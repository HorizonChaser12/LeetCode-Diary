//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/?envType=daily-question&envId=2024-03-05

public class MinLengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s="aabccabba";
        System.out.println(minimumLength(s));
    }

    static int minimumLength(String s) {
            int L = 0;
            int R = s.length() - 1;
            if (s.charAt(L) != s.charAt(R) && s.length() <= 2) {
                return s.length();
            }
            int checkcount=0;
            while (L < R) {
                boolean flag=false;
                if (checkcount>1){
                    break;
                }
                if (s.charAt(L) == s.charAt(R)) {
                    while (L+1!=R && s.charAt(L) == s.charAt(R)) {
                        R--;
                        L++;
                    }
                    if (L+1==R){
                        return L+1-R;
                    }
                    while (s.charAt(L) == s.charAt(L + 1)) {
                        flag=true;
                        L=L+2;
                    }
                }
                if (!flag){
                    checkcount++;
                    L++;
                }

            }
            return Math.abs(L - R);
    }
}
