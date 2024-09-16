class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++){
            int result = num;
            while(result > 0){
                if(result % 10 == k){
                    answer++;
                }
                result /= 10;
            }
        }
        return answer;
    }
}