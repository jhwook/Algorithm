package src.main.java.calculator.problems;

import java.util.Arrays;
import java.util.Collections;

public class N72 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        for(String calling : callings) {
            int callingIndex = Arrays.asList(players).indexOf(calling);
            Collections.swap(Arrays.asList(players), callingIndex, callingIndex - 1);
        }
        answer = players;
        return answer;
    }
}
