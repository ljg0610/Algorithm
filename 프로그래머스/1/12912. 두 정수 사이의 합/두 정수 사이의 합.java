class Solution {
    public long solution(int a, int b) {
        long lo = Math.min(a,b);
        long hi = Math.max(a,b);
        long n = hi - lo + 1;
        return n * (lo + hi) / 2;
    }
}