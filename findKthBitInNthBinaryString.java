//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
public class findKthBitInNthBinaryString {
    public static void main(String[] args) {
        int n = 3, k = 2;
        System.out.println(findKthBit(n,k));
    }
    static char findKthBit(int n, int k) {
//       Can be easily solved using recursion but this way also it passes all test cases due to fewer constraints for the String to form.
        StringBuilder str = new StringBuilder();
        str.append("0");
        for (int i = 1; i < n; i++) {
            StringBuilder rev = new StringBuilder();
            for (int j = str.length()-1; j >= 0; j--) {
                if (str.charAt(j)=='0'){
                    rev.append('1');
                }
                else{
                    rev.append('0');
                }
            }
            str.append("1").append(rev);
        }
        return str.charAt(k-1);
    }
}
