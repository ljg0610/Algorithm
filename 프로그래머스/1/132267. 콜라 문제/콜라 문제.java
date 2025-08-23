class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            int q = n / a;
            int get = q * b;
            answer += get;
            n = get + (n % a);
        }
        return answer;
    }
}