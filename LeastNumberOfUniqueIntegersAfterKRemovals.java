import java.util.*;

//https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/?envType=daily-question&envId=2024-02-16
public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public static void main(String[] args) {
       int[] arr = {4,3,1,1,3,3,2};
       int k = 3;
       System.out.println(findLeastNumOfUniqueInts(arr,k));
    }
    static int findLeastNumOfUniqueInts(int[] arr, int k) {
//      This is half done by me and other half is taken from solution as I am not that good in HashMaps.
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        List <Integer> ls = new ArrayList<>(map.values());
//        Collections.sort(ls);
//        int size = map.size();
//        for(int n : ls){
//            if(n < k){
//                size --;
//                k-=n;
//            }else if(k == n){
//                k-=n;
//                size--;
//            }
//            else{
//                break;
//            }
//        }
//        return size;

//      A good solution without using hashmap that i never could think of.
        Arrays.sort(arr);
        ArrayList<Integer> A = new ArrayList<>();
        int c = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                c++;
            }else{
                A.add(c);
                c = 1;
            }
        }
        A.add(c);
        Collections.sort(A);
        c = 0;
        while(k > 0){
            if(A.get(c) <= k){
                k -= A.get(c);
                c++;
            }else{
                k = 0;
            }
        }
        return A.size()-c;
    }
}
