import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/sort-the-people/description/
public class sortThePeople {
    public static void main(String[] args) {
        String[] names= {"Alice","Bob","Bob"};
        int[] heights={155,185,150};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    static String[] sortPeople(String[] names, int[] heights) {
//        Easy brute force method using arraylist and some of its inbuilt functions but has a high runtime due to function call in the for loop iteratively.
//        List<Integer> list = new ArrayList<>();
//        for (int j = 0; j < heights.length; j++) {
//            list.add(heights[j]);
//        }
//        String[] ans=  new String[names.length];
//        for (int i = 0; i < ans.length; i++) {
//            int index=findMaxIndex(list);
//            ans[i]=names[index];
//            list.set(index,0);
//        }
//        return ans;
//    }
//    static int findMaxIndex(List<Integer> list){
//        int maxindex=0;
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)>max){
//                max=list.get(i);
//                maxindex=i;
//            }
//        }
//        return maxindex;


//        Using bubble sort (my previous approach was based on this)
//        int n=names.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(heights[j]<heights[j+1]){
//                    String temp=names[j];
//                    names[j]=names[j+1];
//                    names[j+1]=temp;
//
//                    int t=heights[j];
//                    heights[j]=heights[j+1];
//                    heights[j+1]=t;
//                }
//            }
//        }
//        return names;

//      Using HashMap is still one of the fastest method to solve this question as the traversing complexity is O(1).
        HashMap<Integer,String> m=new HashMap<>();
        for(int i=0;i< names.length;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[heights.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[j]=m.get(heights[i]);
            j++;
        }
        return ans;
    }
}
