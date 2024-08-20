package src.main.java.calculator.problems;

import java.util.*;

public class N74 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,ArrayList<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportedMap = new HashMap<>();
        ArrayList<String> suspendedUser = new ArrayList<>();
        Map<String, Integer> reportResultMap = new HashMap<>();

        HashSet<String> set = new HashSet<>(List.of(report));

        String[] uniqueReport = set.toArray(new String[0]);

        for(String id : id_list) {
            reportMap.put(id, new ArrayList<>());
            reportedMap.put(id, 0);
        }

        for(String r : uniqueReport) {
            String reportUser = r.split(" ")[0];
            String reportedUser = r.split(" ")[1];
            reportMap.get(reportUser).add(reportedUser);
            reportedMap.put(reportedUser, reportedMap.get(reportedUser) + 1);
        }

        for(Map.Entry<String, Integer> reportedEntry : reportedMap.entrySet()) {
            if(reportedEntry.getValue() >= k) {
                suspendedUser.add(reportedEntry.getKey());
            }
        }


        for(Map.Entry<String, ArrayList<String>> reportEntry : reportMap.entrySet()) {
            reportEntry.getValue().retainAll(suspendedUser);
            reportResultMap.put(reportEntry.getKey(), reportEntry.getValue().size());

        }

        for(int i = 0; i < id_list.length; i++) {
            answer[i] = reportResultMap.get(id_list[i]);
        }



        return answer;
    }
}
