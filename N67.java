package src.main.java.calculator;

public class N67 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        // s = "aukks",  skip = "wbqd", index = 5, result = "happy"
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(s.toCharArray());

        for(char c: skip.toCharArray()) {
            alphabet = alphabet.replace(String.valueOf(c), "");
        }
        System.out.println(alphabet);
        for(char c: s.toCharArray()) {
            int a = alphabet.indexOf(c);

            if((a + index) > alphabet.length() - 1) {
                int n = (a + index) % alphabet.length();
                answer = answer + alphabet.charAt(n);
            }
            else answer = answer + alphabet.charAt(a + index);
        }

        return answer;
    }
}
