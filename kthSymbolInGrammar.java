//https://leetcode.com/problems/k-th-symbol-in-grammar/description/?envType=daily-question&envId=2023-10-25
public class kthSymbolInGrammar {
    public static void main(String[] args) {
        int  n = 3, k = 4;
        System.out.println(kthGrammar(n,k));
    }
    static int kthGrammar(int n, int k) {
        StringBuilder str= new StringBuilder();
        str.append("0");
        n--;
        int i=0;
        while(n!=0){
            if(str.charAt(i)=='0'){
                str.replace(i,i+1, "01");
                i++;
                n--;
                continue;
            }
            if(str.charAt(i)=='1'&& str.length()>=2){
                str.replace(i,i+1, "10");
                i++;
                n--;
            }

        }
        System.out.println(str);
        return str.charAt(k-1)-'0';
    }
}
