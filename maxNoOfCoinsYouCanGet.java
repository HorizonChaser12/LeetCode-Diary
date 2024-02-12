import java.util.Arrays;
//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description/
public class maxNoOfCoinsYouCanGet {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }
//    It is a  logic builder problem,if you can find the pattern that from the end it takes the alternate smaller numbers after sorting then you can build a pretty good code with it.
//    In summary, this code first finds the maximum value in the piles array, then sorts the piles array using counting sort, and finally calculates the sum of specific elements in the sorted array. The purpose of this code is not clear without additional context, but it appears to be a part of a larger algorithm or program.
    static int maxCoins(int[] piles) {
//        Arrays.sort(piles);
//        int result=0;
//        int k=piles.length/3;
//        for(int i=k;i<piles.length;i+=2){
//            result += piles[i];
//        }
//        return result;
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }

        int sort[]=new int[max+1];
        for(int i=0;i<piles.length;i++)
        {
            sort[piles[i]]=sort[piles[i]]+1;
        }
        int j=0;
        for(int i=0;i<sort.length;i++)
        {
            while(sort[i]>0)
            {
                piles[j]=i;
                j++;
                sort[i]--;
            }

        }
        int sum=0;
        for(int i=piles.length-2;i>=(piles.length/3);i-=2)
        {
            sum=sum+piles[i];
        }
        return sum;
    }
}
