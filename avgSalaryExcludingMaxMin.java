//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class avgSalaryExcludingMaxMin {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
        int max=0;
        int min=Integer.MAX_VALUE;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max=salary[i];
            }
            if(min>salary[i]){
                min=salary[i];
            }
            sum=sum+salary[i];
            if(i==salary.length-1){
                sum=(sum-max-min)/(salary.length-2);
            }
        }
        return sum;
    }
}
