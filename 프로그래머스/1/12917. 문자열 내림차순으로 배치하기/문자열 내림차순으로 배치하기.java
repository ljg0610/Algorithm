import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            sb.append(c);
        }
        
        String answer = sb.reverse().toString();
        return answer;
    }
}