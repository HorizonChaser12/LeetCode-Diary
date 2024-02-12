//https://leetcode.com/problems/count-of-matches-in-tournament/submissions/
public class countOfMatchesInTournament {
    public static void main(String[] args) {
        int n=14;
        System.out.println(numberOfMatches(n));
    }
    static int numberOfMatches(int n) {
        int matches=0;
        while(n!=1) {
            if (n % 2 == 0) {
                int k=n;
                matches += k / 2;
                k = k / 2;
                n = (n / 2);
            }
            else{
                int k=n-1;
                matches += k / 2;
                k = k / 2;
                n = (n / 2)+1;
            }
        }
        return matches;
    }
}
