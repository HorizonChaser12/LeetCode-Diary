//https://leetcode.com/problems/largest-odd-number-in-string/description/
public class largestOddNumberInAString {
    public static void main(String[] args) {
        String num = "4206";
        System.out.println(largestOddNumber(num));
    }
    static String largestOddNumber(String num) {
//      Tons of inbuilt functions that I never got to use that much. The question was easy but the need of StringBuilder or these functions is required.
//        int n = num.length();
//        for (int i=n-1;i>=0;i--) {
//            char a=num.charAt(i);
//            int b=Character.getNumericValue(a);
//            if (b%2!=0) {
//                return num.substring(0,i+1);
//            }
//        }
//        return "";

//      A better solution which is actually understandable.
//        int n = num.length();
//        int stop = -1;
//        for(int i=0; i<n; i++){
//            if((num.charAt(i)-'0')%2!=0) stop = i;
//        }
//        return stop==-1?"":num.substring(0, stop+1);


        int number = Integer.parseInt(num);
        if(number%2!=0){
            return num;
        }
        int max = -1;
        for(int i=num.length()-1;i>=0;i--){
            if(Character.valueOf(num.charAt(i))%2!=0){
                max = i;
                break;
            }
        }
        return num.substring(0,max+1);

    }
}
