class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            int point = (n / a) * b;
            answer += point;
            n = n - (a * (n / a)) + point;
        }
        
        return answer;
    }
}