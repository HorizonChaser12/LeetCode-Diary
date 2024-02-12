//https://leetcode.com/problems/number-of-senior-citizens/
public class noOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    static int countSeniors(String[] details) {
//        Have to learn on how to code it without using parseInt
        int count=0;
        StringBuilder s;
        for (String detail : details) {
            s = new StringBuilder();
            for (int j = 11; j < detail.length() - 2; j++) {
                s.append(detail.charAt(j));
            }
            int age = Integer.parseInt(s.toString());
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
