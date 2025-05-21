class Solution {
    public int solution(int a, int b, int n) {
        int cnt = 0;
        while (n >= a) {
            int tmp = n % a;
            int received = (n - tmp) / a * b;
            n = tmp + received;
            cnt += received;
        }
        
        return cnt;
    }
}