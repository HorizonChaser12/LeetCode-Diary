import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/
public class reverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseStrings(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseStrings(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int j = arr.length - 1-i;
           if (j<=i){
               char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
        }
    }
}
