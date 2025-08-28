class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) answer++;
        }
        return answer;
    }
    
    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        
        for (int d = 3; d * d <= x; d += 2) {
            if (x % d == 0) return false;
        }
        
        return true;
    }
}