import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
public class noOfStudentsUnableToEat {
    public static void main(String[] args) {
        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
    static int countStudents(int[] students, int[] sandwiches) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            list1.add(students[i]);
            list2.add(sandwiches[i]);
        }
        int i=0;
        while(!list2.isEmpty() && list1.contains(list2.get(i))){
           if (Objects.equals(list1.get(i), list2.get(i))){
               list1.remove(i);
               list2.remove(i);
           }
           else {
               list1.add(list1.get(i));
               list1.remove(i);
           }
        }
        return list1.size();

//        A better solution with better runtime and less space complexity
//        int scount1=0;
//        int scount0=0;
//
//        for(int i = 0 ; i< students.length ; i++){
//            if(students[i]==1){
//                scount1++;
//            }else{
//                scount0++;
//            }
//        }
//        for(int i = 0 ; i< sandwiches.length ; i++){
//            if(sandwiches[i]==1){
//                if(scount1==0){
//                    return scount0;
//                }
//                scount1--;
//            }else{
//                if(scount0==0){
//                    return scount1;
//                }
//                scount0--;
//            }
//        }
//
//        return 0;
    }
}
