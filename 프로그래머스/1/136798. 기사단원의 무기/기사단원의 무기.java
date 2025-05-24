class Solution {
    public int solution(int number, int limit, int power) {
        int cnt = 1;
        
        for (int i = 2; i <= number; i++) {
            int result = 0;
            
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (i / j == j) {
                        result ++;
                    } else {
                        result += 2;
                    }
                }
            }
            
            if (result <= limit) {
                cnt += result;
            } else {
                cnt += power;
            }
        }
        
        return cnt;
    }
}