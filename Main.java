package src.main.java.calculator;

import src.main.java.calculator.problems.N72;
import src.main.java.calculator.problems.N72_hashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        N72_hashMap sol = new N72_hashMap();
        System.out.println(Arrays.toString(sol.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));

    }
}
