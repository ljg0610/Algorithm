import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) cnt[0]++;
            if (answers[i] == student2[i % student2.length]) cnt[1]++;
            if (answers[i] == student3[i % student3.length]) cnt[2]++;
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == cnt[i]) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}