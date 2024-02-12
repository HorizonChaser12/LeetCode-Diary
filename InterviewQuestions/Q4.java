package InterviewQuestions;
//Given a string s, consisting only of lowercase characters, whenever the word “party” is encountered replace it with the word “pawri”.

public class Q4 {
    public static void main(String[] args) {
        String s="partipartypart";
//        Using inbuilt function.
//        String result = s.replaceAll("party", "pawri");
//        System.out.println(result);
            StringBuilder result = new StringBuilder();
            int n = s.length();

        for (int i = 0; i < n; i++) {
            // Check if the current substring is "party"
            if (i <= n - 5 && s.substring(i, i + 5).equals("party")) {
                // If yes, append "pawri" and move the index accordingly
                result.append("pawri");
                i += 4; // Move index by the length of "party" - 1
            } else {
                // If not, append the current character as it is
                result.append(s.charAt(i));
            }
        }
        String num = "10";
        num=num;
        System.out.println(result);

    }


}
