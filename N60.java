package src.main.java.calculator;

import java.sql.Array;
import java.util.Arrays;

// 기사단원의 무기
public class N60 {
    // number : 기사단원의 수
    // limit : 협약으로 정해진 공격력의 제한수치
    // power : 제한수치를 초과한 기사가 사용할 무기의 공격력
    // answer : 모든 무기를 만들기 위해 필요한 철의 무게를 구하라
    public int solution(int number, int limit, int power) {
        int answer = 0;

        // 1. 1 ~ number 까지 약수의 개수 구하기 (배열로 저장)
        int[] numArr = new int[number];
        numArr[0] = 1;


        System.out.println(Arrays.toString(numArr));
        for(int i = 1; i < numArr.length; i++) {
            int count = 0;

            // i 번째 수의 약수 개수(count) 구하기
            for(int j = 1; j * j <= i + 1; j++) {
                if(j * j == i + 1) count ++;
                else if ((i + 1) % j == 0) count += 2;
            }

            // i 번째 요소를 약수 개수로 초기화
            numArr[i] = count;
        }
        // 2. 배열 순회하면서 limit 보다 큰 요소들 power로 바꿔서 전부 더하기
        for(int n : numArr) {
            if(n > limit) answer += power;
            else answer += n;
        }

        return answer;
    }
}
