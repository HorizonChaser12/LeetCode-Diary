import java.util.*;

public class twoOutThree {
    public static void main(String[] args) {
        int[]  nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }
    static List<Integer> twoOutOfThree(int[] n1, int[] n2, int[] n3) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        for (int value : n1) {
            h1.add(value);
        }
        HashSet<Integer> h2=new HashSet<>();
        for (int k : n2) {
            h2.add(k);
        }
        HashSet<Integer> h3=new HashSet<>();
        for (int j : n3) {
            h3.add(j);
        }
        for(Integer i:h1){
            if(h3.contains(i)){
                h.add(i);
            }
            if(h2.contains(i)){
                h.add(i);
            }
        }
        for(Integer i:h2){
            if(h3.contains(i)){
                h.add(i);
            }
        }
        return h.stream().toList();
    }
}
