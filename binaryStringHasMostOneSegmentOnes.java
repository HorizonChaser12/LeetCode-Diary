// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/?envType=daily-question&envId=2026-03-06
public class binaryStringHasMostOneSegmentOnes {
    public static void main(String[] args) {
        String s = "1100111";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s) {
        // This would work but the problem is the number of characters in the string is more than 100.
        // int n = Integer.valueOf(s);
        // int temp = 0;
        // boolean flag = false;
        // while(n>0){
        //     temp = n%10;
        //     if(!flag && temp == 1){
        //         flag = true;
        //         while (n%10 == 1) {
        //             n = n/10;
        //         }
        //     }
        //     else if(flag && temp == 1) {
        //         return false;
        //     }
        //     n = n/10;
        // }
        // return flag;
        int i  = 0;
        boolean flag = false;
        while (i<s.length()) {
            if (!flag && s.charAt(i)=='1') {
                flag = true;
                while (i<s.length() && s.charAt(i)=='1') {
                    i++;
                }
            }
            else if (flag && s.charAt(i)=='1') {
                return false;
            }
            i++;
        }
        return flag;
    }
    
}
