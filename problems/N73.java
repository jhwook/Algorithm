package src.main.java.calculator.problems;

import java.util.Arrays;

public class N73 {
    public int[] solution(String[] park, String[] routes) {
        //             x  y
        int[] now = {0, 0};
        int row = park[0].length() - 1;
        int col = park.length - 1;

        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                now[0] = park[i].indexOf("S");
                now[1] = i;
            }
        }
        System.out.println(Arrays.toString(now));
        // [[s 0 0] [0 0 0] [0 0 0]]
        for(String route : routes) {
            String[] split = route.split(" ");
            String op = split[0];
            int n = Integer.parseInt(split[1]);
            System.out.println(Arrays.toString(split));
            // [ "SOO","OOO","OOO" ]
            switch (op) {
                case "E" -> {
                    if((now[0] + n) <= row) {
                        boolean flag = true;
                        for(int i = 1; i <= n; i++) {
                            if (park[now[1]].charAt(now[0] + i) == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) now[0] += n;
                    }
                }
                case "W" -> {
                    if((now[0] - n) <= row && (now[0] - n) >= 0) {
                        boolean flag = true;
                        for(int i = 1; i <= n; i++) {
                            if (park[now[1]].charAt(now[0] - i) == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) now[0] -= n;
                    }
                }
                case "S" -> {
                    if((now[1] + n) <= col) {
                        boolean flag = true;
                        for(int i = 1; i <= n; i++) {
                            if (park[now[1] + i].charAt(now[0]) == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) now[1] += n;
                    }
                }
                case "N" -> {
                    if((now[1] - n) <= col && (now[1] - n) >= 0) {
                        boolean flag = true;
                        for(int i = 1; i <= n; i++) {
                            if (park[now[1] - i].charAt(now[0]) == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) now[1] -= n;
                    }
                }
                default -> {}
            }
            System.out.println(Arrays.toString(now));
        }
        int temp = now[0];
        now[0] = now[1];
        now[1] = temp;

        return now;
    }
}
