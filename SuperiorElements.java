import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://www.codingninjas.com/studio/problems/superior-elements_6783446?leftPanelTabValue=SUBMISSION
public class SuperiorElements {
    public static void main(String[] args) {
//        int[] a ={187,64 ,133, 62, 49, 163, 50, 115, 42, 65, 60, 49, 32, 87, 141, 142, 146, 159};
        int[] a = {1,2,2,1};
        System.out.println(superiorElements(a));
    }
    static List< Integer > superiorElements(int []a) {
        // Write your code here.
        // Don't know why but the below code fails for some large test case but i am not able to figure it out why it's happening.
//        List<Integer> list = new ArrayList<>();
//        if (a.length<1){
//            return list;
//        }
//        list.add(a[a.length-1]);
//        int L=0;
//        int R=L+1;
//        while(R<a.length){
//              if(a[L]>a[R]){
//                 R++;
//              }
//              else{
//                  L++;
//                  R=L+1;
//              }
//              if (R==a.length){
//                  if (!list.contains(a[L])){
//                      list.add(a[L]);
//                  }
//                  L++;
//                  R=L+1;
//              }
//        }
//        Collections.sort(list);
//        return list;


//      This code in other hand is very simple and passes all test cases without any issues. Gotta improve my thinking skills more.
        List<Integer> arr = new ArrayList<Integer>();
        int lead =a[a.length-1];
        arr.add(lead);
        for(int i=a.length-2;i>=0;i--)
        {
            if(lead<a[i])
            {
                arr.add(a[i]);
            }
            lead = Math.max(a[i],lead);
        }
        Collections.sort(arr);
        return arr;
    }
}
