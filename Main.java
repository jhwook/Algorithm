package src.main.java.calculator;

import src.main.java.calculator.problems.N29;
import src.main.java.calculator.problems.N69;
import src.main.java.calculator.problems.N73;
import src.main.java.calculator.problems.N74;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        N74 sol = new N74();
        System.out.println(
                (Arrays.toString(sol.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi", "apeach muzi"}, 2))));

    }
}
