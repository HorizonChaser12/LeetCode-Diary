import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicatesInTheArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> list=findDuplicates(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                list.add(arr[index]);
            }
        }
        return list;
    }
}
