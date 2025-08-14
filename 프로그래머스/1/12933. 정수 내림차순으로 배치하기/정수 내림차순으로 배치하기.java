import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}