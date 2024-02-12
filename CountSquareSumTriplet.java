//https://leetcode.com/problems/count-square-sum-triples/description/
public class CountSquareSumTriplet {
    public static void main(String[] args) {
        int n=10;
        System.out.println(countTriples(n));
    }
    static int countTriples(int n) {
        int ans=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                int c = (int) Math.sqrt(i * i + j * j);
                if (c <= n && c * c == i * i + j * j)
                   ans++;
            }
        }
        return ans;
    }
}
