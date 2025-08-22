class Solution {
    public String solution(String s, int n) {
        n %= 26;
        char[] ch = s.toCharArray();
        
        StringBuilder sb = new StringBuilder(s.length());
        
        for (char c : ch) {
            if (c == ' ') {
                sb.append(' ');
                continue;
            }
            
            if (c >= 'a' && c <= 'z') {
                sb.append((char)('a' + (c - 'a' + n) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char)('A' + (c - 'A' + n) % 26));
            }
        }
        
        return sb.toString();
    }
}