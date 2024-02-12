import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/?envType=daily-question&envId=2024-01-02
public class convertArrInto2dArrWithConditions {
    public static void main(String[] args) {
        int[] nums ={1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
    static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int j=0;
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int k=0;
            boolean addedToExistingList = false;
            while (k <= j) {
                if (!list.get(k).contains(nums[i])) {
                    list.get(k).add(nums[i]);
                    addedToExistingList = true;
                    break;
                }
                k++;
            }
                if (!addedToExistingList){
                    j++;
                    if (k <= list.size()) {
                        list.add(new ArrayList<>());
                    }
                    list.get(k).add(nums[i]);
                }
            }
        return list;
    }
}
