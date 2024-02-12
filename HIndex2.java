//https://leetcode.com/problems/h-index-ii/
public class HIndex2 {
    public static void main(String[] args) {
        int[] citations = {0};
        System.out.println(hIndex(citations));
    }
    static int hIndex(int[] citations) {
//        Use of binary search to find the element that has the least number after which all the citations are at least higher than the least number.
        int n=citations.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(citations[mid]==n-mid){
                return n-mid;
            }
            else if(citations[mid]<n-mid){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return n-left;
    }
}
