import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem?isFullScreen=true
public class gameOfTwoStacks {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int[] arr={4,11,16,0,18,17,9,13,7,12,16,19,2,15,5,13,1,10,0,8,0,6,16,12,15,7,1,6,19,16,2};
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        List<Integer> b = new ArrayList<>();
        int[] arr1={15,8,11,16,6,0,5,11,7,9,8,6,3,3,4,8,17,14,9,5,15,15,1,19,10,0,12,8,11,9,11,18,17,14};
        for (int i = 0; i < arr1.length; i++) {
            b.add(arr1[i]);
        }
        int maxSum=5;
        System.out.println(twoStacks(maxSum,a,b));
    }
    static int twoStacks(int maxSum, List <Integer> a, List<Integer> b) {
        int indexA = 0;
        int indexB = 0;
        int maxCount = 0;
        int sum = 0;
        int removedItems = 0;

        while(indexA <  a.size() && sum + a.get(indexA)  <= maxSum) {
            sum = sum + a.get(indexA);
            indexA++;
            removedItems++;
            maxCount++;
        }

        while(indexA >= 0) {
            while(indexB <  b.size() && sum + b.get(indexB) <= maxSum) {
                sum = sum + b.get(indexB);
                indexB++;
                removedItems++;
                if(removedItems > maxCount) {
                    maxCount = removedItems;
                }
            }
            if(indexA == 0)
                break;
            indexA--;
            int preRemovedElement = a.get(indexA);
            sum = sum - preRemovedElement;
            removedItems--;
        }
        return maxCount;


//        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//        int i=a.size()-1;
//        while(i>=0){
//            stack.add(a.get(i));
//            i--;
//        }
//        i=b.size()-1;
//        while(i>=0){
//            stack2.add(b.get(i));
//            i--;
//        }
//        int sum=0;
//        int count=0;
//        int counter = 0;
//        while(!stack.isEmpty() || !stack2.isEmpty()){
//            if(stack.peek()+sum<maxSum && stack.peek()<stack2.peek()){
//                sum=sum+stack.pop();
//                count++;
//            }
//            else if (stack2.peek()+sum<maxSum){
//                sum=sum+stack2.pop();
//                count++;
//            }
//            if(stack2.peek()+sum<maxSum && stack.peek()>stack2.peek()){
//                sum=sum+stack2.pop();
//                count++;
//            }
//            else if (stack.peek()+sum<maxSum){
//                sum=sum+stack.pop();
//                count++;
//            }
//            counter = Math.max(counter,count);
//            if(stack2.peek()+sum>maxSum && stack.peek()+sum>maxSum){
//                return counter;
//            }
//        }
//        return -1;
    }
}
