package InterviewQuestions;
//Reduce the given number to 1 by performing any of the 3 operations – divide by 2, add 1, subtract 1.

public class Q3 {
    public static void main(String[] args) {
        int n=15;
        int steps=0;
        while(n!=1){
            if (n%2==0){
                steps++;
                n=n/2;
            }
            else if ((n+1)%2==0) {
                steps++;
                n=n+1;
            } else if ((n-1)%2==0) {
                steps++;
                n=n-1;
            }
        }
        System.out.println(steps);
    }
}
