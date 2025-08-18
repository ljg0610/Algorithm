class Solution {
    public String solution(int n) {
        int num = n / 2;
        boolean chk = n % 2 == 0;
        String answer = "수박";
        StringBuilder sb = new StringBuilder();
        
        sb.append(answer.repeat(num));
        
        if(!chk) {
            sb.append('수');
        }
        
        return sb.toString();
    }
}