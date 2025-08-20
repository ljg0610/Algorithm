class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(' ');
                idx = 0;
            } else {
                sb.append((idx++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        
        return sb.toString();
    }
}