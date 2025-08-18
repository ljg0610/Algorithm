class Solution {
    public String solution(String s) {
        int n = s.length();
        int mid = n / 2;
        String answer = "";
        
        if (n % 2 == 0) {
            answer = s.substring(mid - 1, mid + 1);
        } else {
            answer = s.substring(mid, mid + 1);
        }
        
        return answer;
    }
}