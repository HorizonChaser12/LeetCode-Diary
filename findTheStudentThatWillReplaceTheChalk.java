//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/description/
public class findTheStudentThatWillReplaceTheChalk {
    public static void main(String[] args) {
        int[] chalk = {1};
        int k = 1000000000;
        System.out.println(chalkReplacer(chalk,k));
    }
    static int chalkReplacer(int[] chalk, int k) {

//        My code runs in 1301ms because of checking every element in the array and it is also in O(n)
//        if(chalk.length==1){
//            return 0;
//        }
//        int pointer=0;
//        while(k!=0 && chalk[pointer]<=k){
//            if(k>=chalk[pointer]){
//                k=k-chalk[pointer];
//                pointer++;
//            }
//            if (pointer==chalk.length && k>chalk[0]){
//                pointer = 0;
//            }
//
//        }
//        return pointer==chalk.length ? 0 : pointer;


//      A better solution due to the use of modulo we dont need to overlook every element rather just compare teh modulo and skip.
        long sum = 0;

        // add all chalk array value to sum
        for(int i : chalk)
        {
            sum+=i;
        }

        //store the modulo value of k and sum
        k%=sum;
        int i;

        for(i = 0;i < chalk.length;i++)
        {
            //if k value is less than chalk array value break the loop and return the index value
            if(k < chalk[i])
            {
                break;
            }
            // else store the k value by k - chalk array element
            k-=chalk[i];
        }
        return i;
    }
}
