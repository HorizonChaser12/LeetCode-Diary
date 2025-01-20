import java.util.ArrayList;
//https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/?envType=daily-question&envId=2025-01-16
public class bitwiseXOROfAllPairings {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3},nums2 ={10,2,5,0};
        System.out.println(xorAllNums(nums1,nums2));
    }
    static int xorAllNums(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                list.add(nums1[i] ^ nums2[j]);
            }
        }
        int XOR = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            XOR^=list.get(i);
        }
        return XOR;
    }
}
