class Solution {
    public int solution(int n) {
        int m = n - 1;
        for (int x = 2; x * x <= m; x++) {
            if (m % x == 0) {
                return x;
            }
        }
        return m;
    }
}