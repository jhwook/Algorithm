package src.main.java.calculator;

import src.main.java.calculator.problems.N73;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        N73 sol = new N73();
        System.out.println(Arrays.toString(sol.solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"})));

    }
}
