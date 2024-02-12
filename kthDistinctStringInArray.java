import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
public class kthDistinctStringInArray {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        int k = 3;
        System.out.println(kthDistinct(arr,k));
    }
//    209ms runtime
    static String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            int j = 0;
            int count = 0;
            while (j <= arr.length - 1) {
                if (!Objects.equals(s, arr[j])) {
                    count++;
                }
                j++;
            }
            if (count == arr.length - 1) {
                list.add(s);
            }
        }
        return list.size()>=k ?  list.get(k-1) : "" ;
    }
//    A better approach with 11ms runtime
//    public String kthDistinct(String[] arr, int k) {
//        HashSet<String> h = new HashSet<>();
//        List<String>l=new ArrayList();
//        for(int i=0;i<arr.length;i++){
//            if(h.contains(arr[i])){
//                l.remove(arr[i]);
//            }
//            else{
//                h.add(arr[i]);
//                l.add(arr[i]);
//            }
//        }
//        if(l.size()<k-1 || l.size()==0){
//            return "";
//        }
//        return l.get(k-1);
//    }
}
