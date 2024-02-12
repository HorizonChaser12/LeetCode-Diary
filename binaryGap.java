//https://leetcode.com/problems/binary-gap/description/
import java.util.*;
public class binaryGap {
    public static void main(String[] args) {
        int n=8;
        System.out.println(binaryGaps(n));
    }
    static int binaryGaps(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%2);
            n=n/2;
        }
        Collections.reverse(list);
        int count;
        int max=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                int k=i+1;
                count=0;
                while(k<list.size()){
                    count++;
                    if (list.get(k)==1){
                        break;
                    }
                    if (k==list.size()-1 && list.get(k)!=1){
                        count=0;
                    }
                    k++;
                }
                if(count>max){
                    max=count;
                }
            }
        }
        return max;

//        A better and more efficient code with good runtime by using the inbuilt library to convert the number into a binary string
//        String binaryStr = Integer.toBinaryString(n);
//        int maxDistance = 0;
//        int currentDistance = 0;
//
//        for (int i = 0; i < binaryStr.length(); i++) {
//            char currentChar = binaryStr.charAt(i);
//
//            if (currentChar == '1') {
//                if (currentDistance > 0) {
//                    maxDistance = Math.max(maxDistance, currentDistance);
//                }
//                currentDistance = 1;
//            } else if (currentChar == '0' && currentDistance > 0) {
//                currentDistance++;
//            }
//        }
//
//        return maxDistance;
    }
}
