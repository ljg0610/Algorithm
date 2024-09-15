class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 4; i <= n; i++){
            int result = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    result++;
                }
            }
            if(result >= 3){
                answer++;
            }
        }
        return answer;
    }
}