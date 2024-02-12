import java.util.ArrayList;
import java.util.Collections;
//https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions
//Failed at 1080 test case
public class duplicatesInArrayGOG {
    public static void main(String[] args) {
        int N = 13;
        int[] a = {3,4,12,3,12,3,4,4,12,7,11,6,5};
        ArrayList<Integer> ans = duplicates(a,N);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here
        int res=0;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=res+1;i<n;i++){
            if(arr[res]==arr[i]){
                if(!list.contains(arr[res])){
                    list.add(arr[res]);
                }
            }
            if(i==n-1){
                i=res+1;
                res++;
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}
