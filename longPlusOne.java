import java.util.ArrayList;

//https://leetcode.com/problems/plus-one/
public class longPlusOne {
    public static void main(String[] args) {
        int[] arr={9,9};
        int[] realans=plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(realans[i]);
        }
    }
    public static int[] plusOne(int[] digits) {
      int last= digits[digits.length - 1];
      if(last==9){
          last=last+1;
          String temp = Integer.toString(last);
          int[] numbers = new int[temp.length()];
          for (int i = 0; i < temp.length(); i++) {
              numbers[i] =  Character.getNumericValue(temp.charAt(i));
          }
            return numbers;
      }
      else {
          last=last+1;
          digits[digits.length-1]=last;
      }
        return digits;
    }
}
