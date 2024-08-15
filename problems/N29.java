package src.main.java.calculator.problems;

public class N29 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] { -1 };

        int[] answer = new int[arr.length - 1];

        int min = arr[0];

        for(int i : arr) {
            if(i < min) min = i;
        }

        if(arr[0] == min){
            for(int i = 1; i < arr.length; i++) {
                answer[i - 1] = arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i ++) {
                if(arr[i] != min) answer[i] = arr[i];
            }
        }


        return answer;
    }
}
