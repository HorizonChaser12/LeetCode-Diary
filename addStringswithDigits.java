//https://leetcode.com/problems/add-strings/
public class addStringswithDigits {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStringss(num1,num2));
    }
    static String addStringss(String num1, String num2) {
        StringBuilder result= new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        int ival;
        int jval;
        while (i>=0 || j>=0 || carry!=0){
            if(i<0) {
                ival=0;
            }
            else {
                ival=num1.charAt(i) - '0';
                i--;
            }
            if(j<0){
                jval=0;
            }
            else {
                jval=num2.charAt(j) - '0';
                j--;
            }
            int sum = ival+jval+carry;
            result.insert(0, (sum % 10));
            carry=sum/10;
        }
    return result.toString();
    }
}
