//https://leetcode.com/problems/maximum-swap/description/
public class maxSwap {
    public static void main(String[] args) {
        int n=98368;
        System.out.println(maximumSwap(n));
    }
    static int maximumSwap(int nums) {
        int digits=0;
        int n=nums;
        while(n>0){
            n=n/10;
            digits++;
        }
        int k=digits-1;
        int[] char1 = new int[digits];
        while(nums>0){
            char1[k]=nums%10;
            nums=nums/10;
            k--;
        }
        int maxindex=0;
        boolean done= false;
        for (int i = 0; i < char1.length-1; i++) {
            for (int j = i+1; j < char1.length; j++) {
                if (char1[i]<char1[j]){
                    int max=Integer.MIN_VALUE;
                    int l=i;
                    while (l!=char1.length){
                        if (char1[l]>=max){
                            max=char1[l];
                            maxindex=l;
                        }
                        l++;
                    }
                    done=true;
                    int temp=char1[i];
                    char1[i]=char1[maxindex];
                    char1[maxindex]=temp;
                    break;
                }
            }
            if(done){
                break;
            }
        }
        int ans=0;
        for (int j : char1) {
            ans = ans * 10 + j;
        }
        return ans;
    }
}
