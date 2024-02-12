import java.util.Objects;
//https://leetcode.com/problems/crawler-log-folder/description/
public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"d1/","../","../","../"};
        System.out.println(minOperations(logs));
    }
    static int minOperations(String[] logs) {
        int step=0;
        for(int i=0;i<logs.length;i++){
            if(Objects.equals(logs[i], "../")){
                if (step==0){
                    continue;
                }
                step--;
            }
            else if(Objects.equals(logs[i], "./")){
                continue;
            }
            else{
                step++;
            }
        }
        return step;
    }
}
