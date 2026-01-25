import java.util.*;
public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {0};
        int k = 23;
        List<Integer> ans = addToArrayForm(num,k);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
//      passes only 90/152 test cases, needs a better approach as the digits can go above the long range
//        StringBuilder str = new StringBuilder();
//        for(int i=0;i<num.length;i++){
//            str.append(num[i]);
//        }
//        Long number = Long.parseLong(str.toString());
//        number = number+k;
//        String ansNumber = String.valueOf(number);
//        List<Integer> ans = new ArrayList<>();
//        for(int i = 0;i<ansNumber.length();i++){
//            ans.add(ansNumber.charAt(i) - '0');
//        }
//        return ans;
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = num.length-1;  i>=0; i--) {
            int temp = k % 10;
            k = k / 10;

            int sum = num[i]+temp+carry;
            carry = sum / 10;
            ans.add(sum % 10);
        }
//        while(k>0){
//            carry = (sum - (sum%10)) / 10;
//            while (carry!=0){
//                sum = num[i]+carry;
//                temp = k % 10;
//                sum = num[i]+temp;
//                carry--;
//            }
//        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}
