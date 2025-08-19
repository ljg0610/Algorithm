class Solution {
    public int solution(String t, String p) {
        int tLen = t.length();
        int pLen = p.length();
        int diffLen = tLen - pLen;
        long target = Long.parseLong(p);
        int answer = 0;
        
        for (int i = 0; i <= diffLen; i++) {
            long result = Long.parseLong(t.substring(i, i + pLen));
            
            if (result <= target) answer++;
        }
        
        return answer;
    }
}