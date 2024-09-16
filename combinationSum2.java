import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSumTwo(candidates,target));
    }
     static List<List<Integer>> combinationSumTwo(int[] candidates, int target) {
         Arrays.sort(candidates);
         System.out.println(Arrays.toString(candidates));
         List<List<Integer>> list = new ArrayList<>();
         int L=0;
         int R=1;
         int sum = 0;
         while(L<candidates.length){
             sum+=candidates[L];
             while(R<candidates.length){
                if (sum==target){
                   List<Integer> list1 = new ArrayList<>();
                    for (int i = L; i < R; i++) {
                        list1.add(candidates[i]);
                    }
                    if (!list.contains(list1)){
                        System.out.println(list1);
                        list.add(list1);
                    }
                } else if (sum>target) {
                    sum-=candidates[L];
                    L++;
                }
                else{
                    sum+=candidates[R];
                    R++;
                }
             }
         }
         return list;
    }
}
