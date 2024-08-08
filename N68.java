package src.main.java.calculator;

import java.util.Arrays;

public class N68 {
    public int solution(int[] ingredient) {
        int answer = 0;

        String[] stringArray = Arrays.stream(ingredient).mapToObj(String::valueOf).toArray(String[]::new);
        // { 2, 1, 1, 2, 3, 1, 2, 3, 1 } => 211231231
        String stringIngredient = String.join("", stringArray);
        int ingredientLength = stringIngredient.length();

        boolean flag = true;

        while(flag) {
            if(stringIngredient.contains("1231")) {
                stringIngredient = stringIngredient.replace("1231", "");
//                System.out.println((ingredientLength - stringIngredient.length()) / 4);
                answer += (ingredientLength - stringIngredient.length()) / 4;
                ingredientLength = stringIngredient.length();
//                System.out.println("ingredientLength : " + ingredientLength);
            } else {
                flag = false;
            }
        }

        return answer;
    }
}
