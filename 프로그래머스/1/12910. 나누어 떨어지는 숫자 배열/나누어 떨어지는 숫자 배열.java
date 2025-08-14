import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        for (int x : arr) {
            if (x % divisor == 0) {
                cnt++;
            }
        }
        
        if (cnt == 0) return new int[]{-1};
        
        int[] answer = new int[cnt];
        int idx = 0;
        for (int x : arr) {
            if (x % divisor == 0) {
                answer[idx++] = x;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}