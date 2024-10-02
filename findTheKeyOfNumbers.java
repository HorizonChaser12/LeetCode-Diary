//https://leetcode.com/problems/find-the-key-of-the-numbers/description/
public class findTheKeyOfNumbers {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println(generateKey(num1,num2,num3));
    }
    static int generateKey(int num1, int num2, int num3) {
//        runs in 11ms and can be improved by using string builder rather than using the String.
//        String builder works better and runs in 2ms.
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        for(int i=0;i<4-Integer.toString(num1).length();i++){
            s1.append("0");
        }
        s1.append(num1);
        for(int i=0;i<4-Integer.toString(num2).length();i++){
            s2.append("0");
        }
        s2.append((num2));
        for(int i=0;i<4-Integer.toString(num3).length();i++){
            s3.append("0");
        }
        s3.append((num3));
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ans.append(Math.min(s1.charAt(i) - '0', Math.min(s2.charAt(i) - '0', s3.charAt(i) - '0')));
        }
        return Integer.parseInt(ans.toString());
    }

}
