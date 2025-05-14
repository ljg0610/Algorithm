import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(one[i % one.length] == answers[i]) {
                oneScore++;
            } 
            if (two[i % two.length] == answers[i]) {
                twoScore++;
            } 
            if (three[i % three.length] == answers[i]) {
                threeScore++;
            }
        }
        
        int[] tmp = {oneScore, twoScore, threeScore};
        int max = Math.max(oneScore, Math.max(twoScore,threeScore));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (max == tmp[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}