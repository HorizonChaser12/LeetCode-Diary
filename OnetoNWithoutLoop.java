import java.util.Arrays;
//https://www.codingninjas.com/studio/problems/print-1-to-n_628290?leftPanelTabValue=PROBLEM
public class OnetoNWithoutLoop {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(printNos(n)));
    }
    static int[] printNos(int x) {
        // Write Your Code Here
        int []ans = new int[x];

        // Calling recursive function
        printNo(x, ans);

        return ans;
    }
    static void printNo(int x,int[] ans){
        if(x == 0) {
            return;
        }

        // Call recursive function
        printNo(x - 1, ans);

        // Insert element in the array
        ans[x - 1] =x;
    }
}
