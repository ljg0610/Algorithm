class Solution {
    public int solution(String t, String p) {
        int len = t.length() - p.length();
        int cnt = 0;
        
        for (int i = 0; i <= len; i++) {
            String result = t.substring(i, i + p.length());
            if (Long.parseLong(result) <= Long.parseLong(p)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}