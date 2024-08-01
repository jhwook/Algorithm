package src.main.java.calculator;

import java.util.*;

public class map {
    public static void main(String[] args) {

        List<Map<String, Object>> array = new ArrayList<Map<String, Object>>();


        HashMap map01 = new HashMap();
        map01.put("id", 30);
        map01.put("name", "전현욱");
        map01.put("과목", new String[]{"국어", "영어"});
        map01.put("국어", new int[]{90, 80});
        map01.put("영어", new int[]{70, 80});

        HashMap map02 = new HashMap();
        map02.put("name", "철수");
        map02.put("id", 31);
        map02.put("과목", new String[]{"국어", "수학"});

        HashMap map03 = new HashMap();
        map03.put("id", 32);
        map03.put("name", "영희");
        map03.put("과목", new String[]{"과학", "영어"});

        array.add(map01);
        array.add(map02);
        array.add(map03);

        System.out.println(array);

        for(Map<String, Object> strMap : array){


            if(strMap.get("id").equals(30)) {
//                System.out.println(strMap);
                System.out.println(strMap.get("id") + " ");
                System.out.println(strMap.get("name") + " ");
//            System.out.println(Arrays.toString((String[])strMap.get("과목")) + " ");
            }
//

        }
//        System.out.println(array);
//        System.out.println(map01.get("age"));
//        System.out.println(map01);
//        System.out.println(Arrays.toString((String[])map01.get("과목")));


    }
}
