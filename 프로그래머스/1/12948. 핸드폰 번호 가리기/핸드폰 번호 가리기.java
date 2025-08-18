class Solution {
    public String solution(String phone_number) {
        if (phone_number == null || phone_number.length() <= 4) {
            return phone_number;
        }
        
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        
        return String.valueOf(ch);
    }
}