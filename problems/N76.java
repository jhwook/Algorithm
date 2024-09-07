package src.main.java.calculator.problems;

public class N76 {
    public String solution(String s) {
        // 주어진 문자열을 공백을 기준으로 단어별로 나누기
        String[] words = s.toLowerCase().split(" ", -1);

        StringBuilder result = new StringBuilder();

        // 각 단어에 대해서 JadenCase 적용
        for (String word : words) {
            if (word.length() > 0) {
                // 첫 문자가 알파벳일 경우 대문자로 변환
                result.append(Character.toUpperCase(word.charAt(0)));
                // 나머지 문자는 소문자로 변환하여 붙이기
                result.append(word.substring(1));
            }
            // 단어 사이에 공백 추가
            result.append(" ");
        }

        // 마지막에 붙은 공백 제거 후 반환
        return result.toString().trim();
    }
}
