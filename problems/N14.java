package src.main.java.calculator.problems;

public class N14 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                answer += i;
                if(n != i * i) answer += n / i;
            }
        }
        return answer;
    }
}
//1 2 4 8 16