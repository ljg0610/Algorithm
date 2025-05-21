import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexed = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lastIndexed.containsKey(ch)) {
                answer[i] = i - lastIndexed.get(ch);
            } else {
                answer[i] = -1;
            }
            
            lastIndexed.put(ch, i);
        }
        
        return answer;
    }
}