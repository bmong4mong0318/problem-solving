import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies){
         List<Integer> answers = new ArrayList<>();

            // privacies 돌면서
            for (int i = 0 ; i < privacies.length; i++){
                // 날짜 계산
                if (checkDate(today, terms, privacies[i])){
                    answers.add(i+1);
                }
                else continue;
            }

            int[] answer = new int[answers.size()];
            int i = 0;
            for (Integer integer : answers) {
                answer[i++] = integer;
            }
        
        return answer;
    }
 
    public boolean checkDate(String today, String[] terms, String privacy){
        String[] a = today.split("\\."); // 2022 05 19
        String[] b = privacy.split(" "); // 2021.05.02 A
        String[] c = b[0].split("\\."); // 2021 05 02
        
        // 다 날짜로 바꿔서 뺄셈
        String alpha = b[1];
        
        int t = Integer.parseInt(a[0]) * 28 * 12 + Integer.parseInt(a[1]) * 28
            + Integer.parseInt(a[2]);
        
        int p = Integer.parseInt(c[0]) * 28 * 12 + Integer.parseInt(c[1]) * 28
            + Integer.parseInt(c[2]);
        
        int termDate = 0;
        for (String term : terms){
            if(term.charAt(0) == alpha.charAt(0)){
                String[] ang = term.split(" ");
                termDate = Integer.parseInt(ang[1]) * 28;  
            }
        }  
        System.out.println("t: " + t);
        System.out.println("p: " + p);
        System.out.println("-: " + (t - p));
        System.out.println("termDate: " + termDate);
        
        if (t - p + 1> termDate)
            return true;
        return false;
    }
    

}