class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String tmp = phone_number.substring((len - 4), len);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len - 4; i++) {
            sb.append('*');
        }
        sb.append(tmp);
        
        return sb.toString();
    }
}