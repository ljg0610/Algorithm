import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> scoreList = new ArrayList<>();
        for (int s : score) {
            scoreList.add(s);
        }
        
        Collections.sort(scoreList, Collections.reverseOrder());
        
        int result = 0;
        for (int i = 0; i + m <= scoreList.size(); i += m) {
            int min = scoreList.get(i + m - 1);
            result += min * m;
        }
        
        return result;
    }
}