//https://leetcode.com/problems/replace-words/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Has some issues and the use of trees is required otherwise the use of hashmap and trie structure.
public class replaceWords {
    public static void main(String[] args) {
        String[] str = new String[]{"e","k","c","harqp","h","gsafc","vn","lqp","soy","mr","x","iitgm","sb","oo","spj","gwmly","iu","z","f","ha","vds","v","vpx","fir","t","xo","apifm","tlznm","kkv","nxyud","j","qp","omn","zoxp","mutu","i","nxth","dwuer","sadl","pv","w","mding","mubem","xsmwc","vl","farov","twfmq","ljhmr","q","bbzs","kd","kwc","a","buq","sm","yi","nypa","xwz","si","amqx","iy","eb","qvgt","twy","rf","dc","utt","mxjfu","hm","trz","lzh","lref","qbx","fmemr","gil","go","qggh","uud","trnhf","gels","dfdq","qzkx","qxw"};
        List<String> dictionary= Arrays.asList(str);
        String sentence="ikkbp miszkays wqjferqoxjwvbieyk gvcfldkiavww vhokchxz dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dco kddxmckhvqifbuzkhstp wc ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy ifvifheoxqlbosfww mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh nxzgnrveghc mpppfhzjkbucv cqcft uwmahhqradjtf iaaasabqqzmbcig zcpvpyypsmodtoiif qjuiqtfhzcpnmtk yzfragcextvx ivnvgkaqs iplazv jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz xbahcwfwm hzd ygelddphxnbh rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj mhs nenrqfkbf spfpazr wrkjiwyf cw dtd cqibzmuuhukwylrnld dtaxhddidfwqs bgnnoxgyynol hg dijhrrpnwjlju muzzrrsypzgwvblf zbugltrnyzbg hktdviastoireyiqf qvufxgcixvhrjqtna ipfzhuvgo daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm ksenb bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn frotscysdyclrc ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp";
        System.out.println(replaceWordss(dictionary,sentence));
    }
    static String replaceWordss(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        System.out.println(dictionary);
        String[] str=sentence.split(" ");
        int j;
        for(int i=0;i<str.length;i++){
            int count=0;
            int k=0;
            j=0;
            char[] char1= str[i].toCharArray();
            while(k<dictionary.size() && j< dictionary.get(k).length()){
                if(char1[j]==dictionary.get(k).charAt(j)){
                    count++;
                    j++;
                }
                else {
                    k++;
                }
                if (k<dictionary.size() && count==dictionary.get(k).length()){
                    str[i]=dictionary.get(k);
                }
            }
        }
        StringBuilder ans= new StringBuilder(str[0]);
        for (int i = 1; i < str.length; i++) {
            ans.append(" ").append(str[i]);
        }
        return ans.toString();


//          A viable solution but the use of many inbuilt functions make it looks easy otherwise with the use of normal logic its hard.
//        Collections.sort(dictionary);
//        StringBuilder ans = new StringBuilder();
//        String[] words = sentence.split(" ");
//
//        for (String word : words) {
//            String root = findRoot(dictionary, word);
//            ans.append(root).append(" ");
//        }
//
//        return ans.toString().trim();
//    }
//
//    private String findRoot(List<String> dictionary, String word) {
//        for (String root : dictionary) {
//            if (word.startsWith(root)) {
//                return root;
//            }
//        }
//        return word;
    }
}
