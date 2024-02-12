import java.util.*;

//https://leetcode.com/problems/second-largest-digit-in-a-string/
public class secondLargestDigitInString {
    public static void main(String[] args) {
        String s = "abc1111";
        System.out.println(secondHighest(s));

    }
    static int secondHighest(String s) {
        HashSet<Integer> list = new HashSet<>();
        char[] char1=s.toCharArray();
        for (int i=0;i<char1.length;i++){
            if (char1[i]-'0'>=0 && char1[i]-'0'<10){
                list.add(char1[i]-'0');
            }
        }
        Object[] arr= list.toArray();
        Arrays.sort(arr);
        if (list.isEmpty() ||  list.size()==1 ){
            return -1;
        }
        return (int) arr[arr.length-2];

//        Use of inbuilt function of isDigit to find digits in a string
//        int firstMax = -1;  // Initialize the first maximum to -1
//        int secondMax = -1; // Initialize the second maximum to -1
//
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c)) {
//                int digit = c - '0'; // Convert character to integer
//
//                if (digit > firstMax) {
//                    secondMax = firstMax; // Update second maximum
//                    firstMax = digit;    // Update first maximum
//                } else if (digit < firstMax && digit > secondMax) {
//                    secondMax = digit; // Update second maximum
//                }
//            }
//        }
//
//        return secondMax;
    }
}
