//https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/description/
public class maxEnemyFortsCaptured {
    public static void main(String[] args) {
        int[] forts = {1,-1,1,0};
        System.out.println(captureForts(forts));
    }
    static int captureForts(int[] forts) {
        int count;
        int max=0;
        for (int i = 0; i < forts.length; i++) {
            count=0;
            if (forts[i]==1) {
                int j = i + 1;
                while (j<forts.length && forts[j] != -1) {
                    if (forts[j]==0){
                        count++;
                    }
                    else if (forts[j]==1) {
                        count=0;
                        break;
                    }
                    j++;
                    if (j==forts.length){
                        count=0;
                    }
                }
            }
            if (forts[i]==-1){
                int k=i+1;
                while (k < forts.length && forts[k]!=1) {
                    if (forts[k]==0){
                           count++;
                    } else if (forts[k]==-1) {
                        count=0;
                        break;
                    }
                    k++;
                    if (k==forts.length){
                        count=0;
                    }
                   }
            }
            if (count>max){
                    max=count;
            }
        }
        return max;
    }
}
