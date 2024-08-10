package src.main.java.calculator.problems;

public class N16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i ++) {
            answer[i] = x + (long) x * i;
        }

        return answer;
    }
}
