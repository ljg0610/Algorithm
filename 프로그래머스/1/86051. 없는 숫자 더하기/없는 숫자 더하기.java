class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] chk = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (!chk[num]) {
                chk[num] = true;
            }
        }
        
        for (int i = 0; i < chk.length; i++) {
            if(!chk[i]) {
                answer += i;
            }
        }
        return answer;
    }
}