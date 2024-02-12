package InterviewQuestions;

public class Q1 {
    public static void main(String[] args) {
        int N = 4, K = 6;
        int[] arr = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr,N,K));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        int diff,c=0;
        int freq[]=new int[9000001];
        for(int i:arr){
            diff=k-i;
            if(diff<0)
                continue;
            if(freq[diff]>0)
                c+=freq[diff];
            freq[i]++;
        }
        return c;
    }
}
