import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            answer[i] = (last[c] == -1) ? -1 : i - last[c];
            last[c] = i;
        }
        
        return answer;
    }
}