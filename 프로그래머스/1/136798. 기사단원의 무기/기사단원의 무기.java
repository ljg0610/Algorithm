class Solution {
    public int solution(int number, int limit, int power) {
        int[] cnt = new int[number + 1];
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            for (int m = i; m <= number; m += i) {
                cnt[m]++;
            }
        }
        
        for (int i = 1; i <= number; i++) {
            answer += (cnt[i] > limit) ? power : cnt[i];
        }
        
        return answer;
    }
}