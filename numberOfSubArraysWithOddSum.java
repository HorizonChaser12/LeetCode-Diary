public class numberOfSubArraysWithOddSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }
    static int numOfSubarrays(int[] arr) {
        int[] prefix =new int[arr.length];
        int count =0;
        int index =0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]+=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        for (int i = 1; i < prefix.length; i++) {
            if(prefix[i]%2!=0){
                count++;
            }
        }
        return count;
    }
}
