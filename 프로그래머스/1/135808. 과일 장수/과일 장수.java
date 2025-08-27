import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        Integer[] scores = new Integer[len];
        
        for (int i = 0; i < len; i++) {
            scores[i] = score[i];
        }
        
        Arrays.sort(scores, Collections.reverseOrder());
        
        for (int i = 0; i + m <= len; i+= m) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (min > scores[i + j]) {
                    min = scores[i + j];
                    if (scores[i + j] > k) {
                        min = k;
                    }
                }
            }
            answer += min * m;
            
            if (i + m > len) return answer;
        }
        
        return answer;
    }
}