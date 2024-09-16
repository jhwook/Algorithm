package src.main.java.calculator.problems;

import java.util.ArrayList;

public class N22 {
    public static void main(String[] args) {
        System.out.println(cola(9, 2, 100));
    }
    public static int cola(int a, int b, int n) {
        // a 개의 빈병 => b 개의 콜라
        // n개의 빈병일떄 ?
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int sum = 0;

        while (n >= a) {
            int quotient = n / a;
            int remainder = n % a;
            System.out.println(" quotient = " + quotient + " remainder = " + remainder);

            arr1.add(quotient);
            arr2.add(remainder);

            if(quotient < a) arr2.add(quotient);
            System.out.println(" arr1 = " + arr1 + " arr2 = " + arr2);
            n = quotient;
        }

        for(int i : arr1) {
            sum += i;
        }

        int sum2 = 0;

        for(int j : arr2) {
            sum2 += j;
        }

        return  sum * b + (int) Math.ceil(sum2 / a);
    }


}
