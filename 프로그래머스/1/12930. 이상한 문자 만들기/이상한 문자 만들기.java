class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for (char c : ch) {
            if (c == ' ') {
                sb.append(c);
                idx = 0;
            } else {
                if (idx == 0 || idx % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                
                idx++;
            }
        }
        
        return sb.toString();
    }
}