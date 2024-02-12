//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.*;

public class allNumbersThatDidntAppear {
    public static void main(String[] args) {
        int[] arr={1,1};
        List<Integer> list = findDisappearedNumbers(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==0){
                list.add(i);
            }
        }
        if (list.contains(0)){
            list.remove(0);
        }
        return list;
    }
}
