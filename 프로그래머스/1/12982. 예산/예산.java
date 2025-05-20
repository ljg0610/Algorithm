import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int cnt = 0;
        
        for (int depart : d) {
            if (budget - depart >= 0) {
                budget -= depart;
                cnt++;
            }
        }
        
        return cnt;
    }
}