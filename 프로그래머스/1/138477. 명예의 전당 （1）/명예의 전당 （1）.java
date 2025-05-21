import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honorList = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            int num = score[i];
            
            honorList.add(num);
            Collections.sort(honorList);
            Collections.reverse(honorList);
            
            if (honorList.size() < k) {
                answer[i] = honorList.get(honorList.size() - 1);
            } else {
                answer[i] = honorList.get(k-1);
            }
            
        }
        return answer;
    }
}