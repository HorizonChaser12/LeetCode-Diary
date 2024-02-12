import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/

public class noOfLaserBeamsInBank {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    static int numberOfBeams(String[] bank) {
//        A simple solution
//        int cnt=0;
//        List<Integer> li = new ArrayList<>();
//        for(int i=0;i<bank.length;i++){
//            int oneCount=0;
//            for(int j=0;j<bank[i].length();j++){
//                if(bank[i].charAt(j)=='1')
//                    oneCount++;
//            }
//            if(oneCount!=0)
//                li.add(oneCount);
//        }
//        if(li.size()==1)
//            cnt=0;
//        else{
//            for(int i=1;i<li.size();i++){
//                cnt+=li.get(i)*li.get(i-1);
//            }
//        }
//        return cnt;

//        Best Solution the human has found so far!
        int prevRowCount = 0;
        int total=0;

        for(String row : bank) {
            int curRowCount = calc(row);
            if(curRowCount==0)
                continue;

            total += curRowCount * prevRowCount;
            prevRowCount = curRowCount;
        }
        return total;
    }
    static int calc(String s) {
        int count = 0;
        for(char c : s.toCharArray())
            count += c - '0';
        return count;
    }
}

