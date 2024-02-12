public class GCDorHCF {
    public static void main(String[] args) {
        int n=63,m=63;
        System.out.println(calcGCD(n,m));
    }
    static int calcGCD(int n, int m){
        // Write your code here.
//        int i=1;
//        int max=0;
//        while(i<=Math.max(n, m)){
//            if(m%i==0 && n%i==0 && max<i){
//                max=i;
//            }
//            i++;
//        }
//        return max;

//      Recursive Approach
//        Time Complexity: O(log(a))
//        Space Complexity: O(1)
//        Where 'a' is minimum of 'n' and 'm'.
        if (m > n)
        {
            int temp = n;
            n = m;
            m = temp;
        }

        // Base case of gcd(n,0) = n.
        if (m == 0)
        {
            return n;
        }

        // Using Euclidean Theorem.bru
        return calcGCD(m, n % m);
    }
}
