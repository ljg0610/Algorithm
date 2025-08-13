class Solution {
    public long solution(long n) {
        long num = (long)Math.sqrt(n);
        if (num * num == n) {
            long next = num + 1;
            return next * next;
        }
        return -1;
    }
}