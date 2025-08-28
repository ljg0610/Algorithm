class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int maxW = Math.max(wallet[0], wallet[1]);
        int minW = Math.min(wallet[0], wallet[1]);
        int a = bill[0];
        int b = bill[1];
        
        while (true) {
            int bigB = Math.max(a, b);
            int smallB = Math.min(a, b);
            
            if (bigB <= maxW && smallB <= minW) break;
            
            if (a >= b) a /= 2;
            else b /= 2;
            
            answer++;
        }
        return answer;
    }
}