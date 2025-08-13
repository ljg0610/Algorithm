class Solution {
    public long solution(long n) {
        long answer = -1;
        double num = Math.sqrt(n);
        if (num % 1 == 0) {
            return (long)Math.pow((num + 1), 2);
        }
        return answer;
    }
}