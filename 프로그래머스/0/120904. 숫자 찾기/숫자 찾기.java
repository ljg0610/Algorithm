class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        int result = 0;
        while(num > 0){
            if(num % 10 == k){
                result = answer;
            }
            num /= 10;
            answer++;
        }
        if(result != 0){
            return answer - result;
        }
        return -1;
    }
}