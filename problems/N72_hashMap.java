package src.main.java.calculator.problems;

import java.util.HashMap;

public class N72_hashMap {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> playersMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for(String calling : callings) {
            int idx = playersMap.get(calling);
            playersMap.put(calling, idx - 1);
            String overTakenPlayer = players[idx - 1];
            playersMap.put(overTakenPlayer, idx);

            String tmp = players[idx -1];
            players[idx - 1] = players[idx];
            players[idx] = tmp;
        }

        answer = players;
        return answer;
    }
}
