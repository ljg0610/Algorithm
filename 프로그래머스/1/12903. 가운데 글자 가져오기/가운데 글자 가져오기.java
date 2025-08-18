class Solution {
    public String solution(String s) {
        int idx = 0; 
        String answer = "";
        if (s.length() % 2 == 1) {
            idx = s.length() / 2;
            answer = s.substring(idx, idx + 1);
        } else {
            idx = s.length() / 2 - 1;
            answer = s.substring(idx, idx + 2);
        }
        
        return answer;
    }
}