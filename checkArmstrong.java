import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.codingninjas.com/studio/problems/check-armstrong_589?leftPanelTabValue=PROBLEM
public class checkArmstrong {
    public static void main(String[] args) {
        // Write your code here
        Scanner SC= new Scanner(System.in);
        int n= 1634;
        System.out.println(checkArm(n));

    }
    static boolean checkArm(int n){
        int original=n;
        int size=0;
        List <Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n=n/10;
            size++;
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            n= (int) (n+Math.pow(list.get(i),size));
        }
        return n == original;
    }
}
