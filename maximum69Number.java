//https://leetcode.com/problems/maximum-69-number/description/
public class maximum69Number {
    public static void main(String[] args) {
        int num=9996;
        System.out.println(maximum69Numbers(num));
    }
    static int maximum69Numbers (int n) {
        int[] arr= new int[findsize(n)];
        int i=arr.length-1;
        while (n > 0) {
            arr[i]=n % 10;
            n = n / 10;
            i--;
        }
        int j = 0;
        while (j<arr.length){
           if (arr[j]==6){
               arr[j]=9;
               break;
           }
           j++;
        }
        int k = 0;
        int ans = 0;
        while (k < arr.length) {
            int digit = arr[k];
            ans = ans * 10 + digit;
            k++;
        }
        return ans;
    }
    static int findsize(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
