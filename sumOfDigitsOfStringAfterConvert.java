//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/

public class sumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s,k));
    }
    static int getLucky(String s, int k) {
//       3 ms runtime and works in O(n^2) due to the conversion of string to char array and then to control the integer size while converting it from string.
//        char[] char1 = s.toCharArray();
//        int join = 0;
//        for (int i = 0; i < char1.length; i++) {
//            char[] char2=Integer.toString(char1[i]-'z'+26).toCharArray();
//            for (int j = 0; j < char2.length; j++) {
//                join+=Integer.parseInt(Character.toString(char2[j]));
//            }
//        }
//        k--;
//        int ans=0;
//        while(k!=0){
//            int n=join;
//            ans=0;
//            for (int i = 0; i < Integer.toString(join).length(); i++) {
//                ans+=n%10;
//                n=n/10;
//            }
//            join=ans;
//            k--;
//        }
//        return ans==0? join : ans;


//       Better code and works at 1ms and is O(n^2)
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int temp = s.charAt(i) - 96;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
        }
        k--;
        int num = sum;
        while (k > 0) {
            sum = 0;
            int temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            num = sum;
            k--;
        }
        return sum;
    }
}
