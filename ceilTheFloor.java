import java.util.Arrays;
//https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?leftPanelTabValue=PROBLEM
public class ceilTheFloor {
    public static void main(String[] args) {
        int[] nums = {3,17,23};
        int x=12;
        System.out.println(Arrays.toString(getFloorAndCeil(nums,x)));
    }
    static int[] getFloorAndCeil(int[] a, int x) {
       int start=0;
       int end=a.length-1;
       while(start<=end){
           int mid= start + (end-start) / 2;
           if(a[mid]==x){
               return new int[] {a[mid],a[mid]};
           }
           else if(x>a[mid]){
               start=mid+1;
           }
           else if (x<a[mid]) {
               end=mid-1;
           }
       }
       if (start>=a.length){
           return new int[] {a[end],-1};
       }
       else if (end<0){
            return new int[] {-1,a[start]};
       }
       return new int[] {a[end],a[start]};
    }
}
