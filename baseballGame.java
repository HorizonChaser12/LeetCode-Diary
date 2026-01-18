//https://leetcode.com/problems/baseball-game/description/

import java.util.ArrayList;
import java.util.Stack;

public class baseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
    static int calPoints(String[] operations){
//        ArrayList<Integer> list=  new ArrayList<>();
//        int pointer = 0;
//        for (int i = 0; i < operations.length; i++) {
//            if(operations[i].equals("+") && list.size()>=2){
//                list.add(list.get(pointer-1)+list.get(pointer-2));
//                pointer++;
//            }
//            else if(operations[i].equals("D") && !list.isEmpty()){
//                list.add(list.get(pointer-1)*2);
//                pointer++;
//            }
//            else if (operations[i].equals("C") && !list.isEmpty()){
//                list.remove(pointer-1);
//                pointer--;
//            }
//            else{
//                list.add(Integer.parseInt(operations[i]));
//                pointer++;
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        return sum;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+") && stack.size()>=2){
                stack.add(stack.get(stack.size()-2)+ stack.peek());
                break;
            }
            else if(operations[i].equals("D") && !stack.isEmpty()){
                stack.add(stack.peek()*2);
                break;
            }
            else if (operations[i].equals("C") && !stack.isEmpty()){
                stack.pop();
                break;
            }
            else {
                stack.add(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
