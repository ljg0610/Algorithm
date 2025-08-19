class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int r = (int) Math.sqrt(i);
            
            answer = r * r == i ? answer - i : answer + i;
        }
        
        return answer;
    }
}