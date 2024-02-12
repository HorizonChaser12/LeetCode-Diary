import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/monotone-increasing-digits/description/

public class monotoneIncreasingDigits {
    public static void main(String[] args) {
        int n = 300;
        System.out.println(monotoneIncreasingDigit(n));
    }
    static int monotoneIncreasingDigit(int i) {
//        This works but has a complexity of O(n)
        int count;
        while(i!=0){
            List<Integer> digits = getdigits(i);
            count=0;
            for(int j=0;j<digits.size()-1;j++){
                if(digits.get(j)<=digits.get(j+1)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==digits.size()-1){
                return i;
            }
            i--;
        }
        return -1;
//        Works in O(log10(n)) and is pretty efficient for long digits too.
//        int prevDigit = 9; // Initialize the previous digit to 9
//        int result = 0;   // Initialize the result to 0
//        int multiplier = 1; // Used to build the result with the digits
//
//        while (n > 0) {
//            int digit = n % 10;
//            if (digit > prevDigit) {
//                result = digit * multiplier - 1;
//                prevDigit = digit - 1;
//            } else {
//                result += digit * multiplier;
//                prevDigit = digit;
//            }
//
//            n /= 10;
//            multiplier *= 10;
//        }
//
//        return result;
    }
    public static List<Integer> getdigits(int i){
        List<Integer> list= new ArrayList<>() ;
        while(i!=0){
            int temp=i%10;
            list.add(temp);
            i=i/10;
        }
        Collections.reverse(list);
        return list;
    }
}
