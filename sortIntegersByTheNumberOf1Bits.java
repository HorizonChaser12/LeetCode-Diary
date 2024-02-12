import java.util.Arrays;
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/?envType=daily-question&envId=2023-10-30
public class sortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr={1111,7644,1107,6978,8742,1,7403,7694,9193,4401,377,8641,5311,624,3554,6631};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    static int[] sortByBits(int[] arr) {
//        Have to learn the approach and work upon it to know bit manipulation better and learn how the inbuilt library are used.
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                int iBit = Integer.bitCount(arr[i]);
                int jBit = Integer.bitCount(arr[j]);
                if(iBit > jBit) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                } else if (jBit == iBit && arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return arr;
    }
}
