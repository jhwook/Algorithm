package src.main.java.calculator.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N69 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};

        for(int i = 0; i < survey.length; i++) {
            System.out.println(Arrays.toString(survey[i].split("")));
            String s;
            if(choices[i] > 4) {
                s = survey[i].split("")[1];
                Integer a = map.get(s) + score[choices[i]];
                map.put(s, a);
            } else if(choices[i] < 4) {
                s = survey[i].split("")[0];
                Integer a = map.get(s) + score[choices[i]];
                map.put(s, a);
            }
        }
        System.out.println(map);

        if(map.get("R") >= map.get("T")) answer += "R";
        if(map.get("R") < map.get("T")) answer += "T";
        if(map.get("C") >= map.get("F")) answer += "C";
        if(map.get("C") < map.get("F")) answer += "F";
        if(map.get("J") >= map.get("M")) answer += "J";
        if(map.get("J") < map.get("M")) answer += "M";
        if(map.get("A") >= map.get("N")) answer += "A";
        if(map.get("A") < map.get("N")) answer += "N";


        return answer;
    }
}
