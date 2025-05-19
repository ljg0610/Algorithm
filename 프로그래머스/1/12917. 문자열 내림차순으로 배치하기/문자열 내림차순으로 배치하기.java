import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder(new String(ch));
        String answer = sb.reverse().toString();
        return answer;
    }
}