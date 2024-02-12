//https://leetcode.com/problems/remove-element/
//Use of inplace algoritm,edited the same array rather than creating a new one.
public class ElementRemoval {
    public static void main(String[] args) {
        int[] arr1={0,1,2,2,3,0,4,2};
        int target=2;
        int realans=removeElement(arr1,target);
        System.out.println(realans);
    }
    public static int removeElement(int[] nums, int val) {
        int[] arr=new int[nums.length];
        int count=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                arr[i]=nums[i];
            }
            else {
                count++;
            }
        }
        return arr.length-count;
    }
    static int[] returnArray(int[] arr2,int t){
        int[] arr=new int[arr2.length];
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==t){
                arr[i]=arr2[i];
            }
            else {
                count++;
            }
            }
        return arr;
        }
    }
