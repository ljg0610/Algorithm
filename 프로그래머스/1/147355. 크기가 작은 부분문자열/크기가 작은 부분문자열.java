class Solution {
    public int solution(String t, String p) {
        int tLen = t.length();
        int pLen = p.length();
        int answer = 0;
        
        for (int i = 0; i <= tLen - pLen; i++) {
            long result = Long.parseLong(t.substring(i, i + pLen));
            long numP = Long.parseLong(p);
            
            if (result <= numP) answer++;
        }
        
        return answer;
    }
}