package InterviewQuestions;
//Swap without using the 3rd variable.

public class Q2 {
    public static void main(String[] args) {
        int a=5,b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
